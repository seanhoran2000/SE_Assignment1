package testProject;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.joda.time.DateTime;
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
	
	@Test
	public void testModule() {
		Student s1 = new Student();
		s1.setAge(19);
		s1.setName("Sean");
		
		Student s2 = new Student();
		s2.setAge(21);
		s2.setName("Mark");
		
		Module m = new Module();
		m.setMName("Software Engineering");
		m.setMId("CT4102");
		m.addStudent(s1);
		m.addStudent(s2);
		assertTrue(m.getStudents().contains(s1));
		assertTrue(m.getStudents().contains(s2));
	}
	
	@Test
	public void testCourse() {
		Course c = new Course();
		c.setCName("Computer Science and IT");
		c.setStartDate(DateTime.parse("2021-09-01"));
		c.setEndDate(DateTime.parse("2022-05-31"));
		assertEquals(DateTime.parse("2021-09-01"),c.getStartDate());
		assertEquals(DateTime.parse("2022-05-31"),c.getEndDate());
	}

}
