package testProject;
import java.util.ArrayList; // import the ArrayList class

public class Module {
	private String mName;
	private String mId;
	private ArrayList<Student> students = new ArrayList<Student>(); // Create an ArrayList object
	//private ArrayList<Student> students = new ArrayList<Student>(); // Create an ArrayList object
	
	public String getMName() {
		return mName;
	}
	public void setMName(String mName) {
		this.mName = mName;
	}
	
	public String getMId() {
		return mId;
	}
	public void setMId(String mId) {
		this.mId = mId;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
}
