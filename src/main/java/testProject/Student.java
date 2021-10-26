package testProject;

//import org.joda.time.*;
public class Student {
	private String name;
	private int age;
	private String DOB;
	private String username;
	private String [] courses;
	private String [] modules;
	
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
	/*public void setUsername(String username) {
		this.username = username;
	}*/
	
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String[] getModules() {
		return modules;
	}
	public void setModules(String[] modules) {
		this.modules = modules;
	}
}
