package com.example.demo;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.modelclasses.Movie;
import com.modelclasses.Movie.Genre;

import junit.framework.Assert;
import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieTest {

	@Test
	public void testConstructor(){
		try {
			Movie obj = new Movie("", Genre.THRILLER);
			fail("Exception was expected for empty name input");
		} catch(IllegalArgumentException e) {
		}
	}
	
	@Test
	public void testName() {
		Movie obj = new Movie();
		try {
			obj.setName("");
			fail("Exception was expected for empty title input");
		}
		catch(IllegalArgumentException e) {
		}
	}
	
	@Test
	public void testId() {
		Movie obj = new Movie();
		Movie obj2 = new Movie();
		long expectedValue = 2;
		long actualValue = obj2.getMovie_id();
		Assert.assertEquals(expectedValue, actualValue);
	}

	
	
}

