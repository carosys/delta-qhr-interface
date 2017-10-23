package com.sdm.delta.qhr.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sdm.delta.qhr.DeltaQhrApplication;
import com.sdm.delta.qhr.dao.UserDao;
import com.sdm.delta.qhr.model.User;

@RunWith(SpringRunner.class)
@WebMvcTest(value = RestApiController.class)
@ContextConfiguration(classes={DeltaQhrApplication.class})
public class RestApiControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	

	@MockBean
	private UserDao userDao;
	
	User mockUser = new User(1, "jean", "jean.mercier@gmail.com");
	

	@Test
	public void retrieveUser() throws Exception {

		Mockito.when(userDao.findUserById(Mockito.anyInt())).thenReturn(mockUser);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(	"/api/user/1").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{id:1,name:jean,email:jean.mercier@gmail.com}";

		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}



}
