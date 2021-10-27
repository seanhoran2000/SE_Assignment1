package testProject;

import java.util.ArrayList; // import the ArrayList class

public class Student {
	private String name;
	private int age;
	private String DOB;
	private String username;
	private ArrayList<Course> courses = new ArrayList<Course>(); // Create an ArrayList object
	private ArrayList<Module> modules = new ArrayList<Module>(); 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	public String getUsername() {
		username = name+age;
		return username;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void addCourse(Course c) {
		courses.add(c);
	}
	public void removeCourse(Course c) {
		courses.remove(c);
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void addModule(Module m) {
		modules.add(m);
	}
	public void removeModule(Module m) {
		modules.remove(m);
	}
}
