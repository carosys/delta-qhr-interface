package com.sdm.delta.qhr.dao.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sdm.delta.qhr.DeltaQhrApplication;
import com.sdm.delta.qhr.dao.UserDao;
import com.sdm.delta.qhr.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeltaQhrApplication.class)
public class UserDaoTest {
	@Autowired
    private UserDao userDAO;
	   @Test
	    public void findAllUsers() {
	        List<User> users = userDAO.findAll();
	        assertNotNull(users);
	        assertTrue(!users.isEmpty());
	    }

	    @Test
	    public void findUserById() {
	        User user = userDAO.findUserById(1);
	        assertNotNull(user);
	    }

	    @Test
	    public void createUser() {
	        User user = new User(100, "John", "john@gmail.com");
	        if(userDAO.isUserExist(user)) {
	        	userDAO.deleteUserById(user.getId());
	        }
	        User savedUser = userDAO.create(user);
	        User newUser = userDAO.findUserById(savedUser.getId());
	        assertNotNull(newUser);
	        assertEquals("John", newUser.getName());
	        assertEquals("john@gmail.com", newUser.getEmail());
	    }
}
