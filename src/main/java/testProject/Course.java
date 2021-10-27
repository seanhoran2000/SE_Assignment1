package testProject;
import org.joda.time.*;
import java.util.ArrayList;

public class Course {
	private String cName;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;
	
	public String getCName() {
		return cName;
	}
	public void setCName(String cName) {
		this.cName = cName;
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
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public void removeStudent(Student s) {
		students.remove(s);
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}
