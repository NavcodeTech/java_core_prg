package com.coforge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
	User user;
	@BeforeEach
	public void setUp() throws Exception {
		user=new User(1009,"Aman Kumar",45000);
	}

	@Test
	public void testGetUserId() {
		assertEquals(user.getUserId(),1009);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetUserName() {
		//fail("Not yet implemented");
		assertEquals(user.getUserName(),"Aman Kumar");
	}

	@Test
	public void testGetUserSalary() {
		//fail("Not yet implemented");
		assertEquals(user.getUserSalary(),45000.0f,0.0f);
	}

}
