package com.sdm.delta.qhr.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.sdm.delta.qhr.dao.QhrPatientDao;
import com.sdm.delta.qhr.dao.UserDao;
import com.sdm.delta.qhr.model.User;
import com.sdm.delta.qhr.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	QhrPatientDao qhrPatientDao;
	
	@RequestMapping(value = "/gender/", method = RequestMethod.GET)
    public List<Map<String,?>> getGender() {
		
		return qhrPatientDao.home();
	}
	// -------------------Create Patient at QHR---------------------------------------------
	
    @RequestMapping(value = "/qhrpatient/{rxaaid}", method = RequestMethod.POST)
    public ResponseEntity<?> createQhrPatient(@PathVariable("rxaaid") long rxaaid, UriComponentsBuilder ucBuilder) {
        logger.info("Creating QHRPatient : {}", rxaaid);
        
        HttpHeaders headers = new HttpHeaders();
 
        if (qhrPatientDao.isQhrPatientExist(rxaaid)) {
        	qhrPatientDao.updateQhrPatient(rxaaid);
            logger.error("Unable to create patient exists. Updating",rxaaid);
            return new ResponseEntity<String>(headers, HttpStatus.OK);
        }
        qhrPatientDao.createQhrPatient(rxaaid);
 
        headers.setLocation(ucBuilder.path("/qhrpatient/{rxaaid}").buildAndExpand(rxaaid).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	// -------------------Update Patient at QHR---------------------------------------------
	
	
    // -------------------Retrieve All Users---------------------------------------------
	 
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userDao.findAll();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
 
    // -------------------Retrieve Single User------------------------------------------
 
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("id") int id) {
        logger.info("Fetching User with id {}", id);
        User user = userDao.findUserById(id);
        if (user == null) {
            logger.error("User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("User with id " + id 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
 
    // -------------------Create a User-------------------------------------------
 
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
        logger.info("Creating User : {}", user);
 
        if (userDao.isUserExist(user)) {
            logger.error("Unable to create. A User with name {} already exist", user.getName());
            return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
            user.getName() + " already exist."),HttpStatus.CONFLICT);
        }
        userDao.create(user);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
 
    // ------------------- Update a User ------------------------------------------------
 
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody User user) {
        logger.info("Updating User with id {}", id);
 
        User currentUser = userDao.findUserById(id);
 
        if (currentUser == null) {
            logger.error("Unable to update. User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
 
        currentUser.setName(user.getName());
        currentUser.setEmail(user.getEmail() );
  
        userDao.updateUser(currentUser);
        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
    }
 
    // ------------------- Delete a User-----------------------------------------
 
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
        logger.info("Fetching & Deleting User with id {}", id);
 
        User user = userDao.findUserById(id);
        if (user == null) {
            logger.error("Unable to delete. User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        userDao.deleteUserById(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All Users-----------------------------
 
    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteAllUsers() {
        logger.info("Deleting All Users");
 
        userDao.deleteAllUsers();
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

}
