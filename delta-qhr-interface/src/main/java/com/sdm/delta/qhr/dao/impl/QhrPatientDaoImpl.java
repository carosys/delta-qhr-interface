/**
 * 
 */
package com.sdm.delta.qhr.dao.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sdm.delta.qhr.dao.QhrPatientDao;
import com.sdm.delta.qhr.model.Patient;
import com.sdm.delta.qhr.model.Quote;

/**
 * @author jmercier
 *
 */
@Repository
@EnableOAuth2Client
@EnableAutoConfiguration
public class QhrPatientDaoImpl implements QhrPatientDao {
	
	private static final Logger log = LoggerFactory.getLogger(QhrPatientDao.class);
	
	@Value("${oauth.resource:https://s-accapi.accuroemr.com/rest/v1}")
	private String baseUrl;

	@Value("${oauth.authorize:https://s-accapi.accuroemr.com/}")
	private String authorizeUrl;

	@Value("${oauth.token:https://s-accapi.accuroemr.com/oauth/token}")
	private String tokenUrl;
	
	@Value("${oauth.tenant:SDMLB}")
	private String tenant;
	
	@Value("${oauth.uuid:1697e08c-867a-4521-a73b-e797e23db96e}")
	private String uuid;
	
	@Autowired
	RestTemplate restTemplateNoAuth;
	
	
	@Autowired
	private OAuth2ProtectedResourceDetails resource;
	
	@Autowired
	private OAuth2RestOperations restTemplate;

	/* (non-Javadoc)
	 * @see com.sdm.delta.qhr.dao.QhrPatientDao#isQhrPatientExist(long)
	 */
	@Override
	public boolean isQhrPatientExist(long rxaaid) {
		Quote quote = restTemplateNoAuth.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info("from isQhrPatientExist="+quote.toString());
		return false;
	}

	/* (non-Javadoc)
	 * @see com.sdm.delta.qhr.dao.QhrPatientDao#updateQhrPatient(long)
	 */
	@Override
	public void updateQhrPatient(long rxaaid) {
		Quote quote = restTemplateNoAuth.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info("from updateQhrPatient="+quote.toString());
	}
	
	@Override
	public  Quote getQhrQuote() {
		Quote quote = restTemplateNoAuth.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info("from updateQhrPatient="+quote.toString());
		return quote;
	}

	/* (non-Javadoc)
	 * @see com.sdm.delta.qhr.dao.QhrPatientDao#createQhrPatient(long)
	 */
	@Override
	public void createQhrPatient(long rxaaid) {
		Quote quote = restTemplateNoAuth.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info("from updateQhrPatient="+quote.toString());
	}
	
	public List<Map<String,?>> home() {
		
		String uri = buildQhrUrlString("/genders");
		List<Map<String,?>> result = restTemplate.getForObject(uri, List.class);
		
		return result;
	}
	
	@Override
	public List<Patient> searchQhrPatientViaPhn(String phn) {
		UriComponentsBuilder builder = buildQhrUrl("/patients/search");
		builder.queryParam("phn",phn);
	        ResponseEntity<Patient[]> responseEntity = restTemplate.getForEntity(builder.toUriString(), Patient[].class);
	        Patient[] objects = responseEntity.getBody();
	        return Arrays.asList(objects);
	}
	
	private UriComponentsBuilder  buildQhrUrl(String path) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl)
		.path(path)
	    .queryParam("tenant", tenant)
	    .queryParam("uuid", uuid);
		return builder;
	}

	private String  buildQhrUrlString(String path) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl)
		.path(path)
	    .queryParam("tenant", tenant)
	    .queryParam("uuid", uuid);
		return builder.toUriString();
	}
	
	
	
	@Bean
	protected OAuth2ProtectedResourceDetails resource() {
		ClientCredentialsResourceDetails resource = new ClientCredentialsResourceDetails();
		resource.setAccessTokenUri(tokenUrl);
		resource.setClientId("jfvtcjulhmcrbb8p65l35516t4");
		resource.setClientSecret("st6ni33c5flg3leo8cqk7u99mbp1hmvkqu046ojnd3t8s48nv30n");
		resource.setGrantType("client_credentials");
		return resource ;
	}
	
	@Bean
	public OAuth2RestOperations restTemplate(OAuth2ClientContext oauth2ClientContext) {
		return new OAuth2RestTemplate(resource, oauth2ClientContext);
	}



}
