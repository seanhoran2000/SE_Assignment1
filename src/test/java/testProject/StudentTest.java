package testProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	@Test
	public void testGetUsername() {
		Student s = new Student();
		s.setAge(19);
		s.setName("Sean");
		assertEquals("Assert Username is not null", "Sean19", s.getUsername());
		//fail("Not yet implemented");
	}

}
