package dependancyInjection.com;

public class Student {
	private int id;
	private String studentName;
	
public Student(int id, String studentName) {
	
		this.id = id;
		this.studentName = studentName;
	}


public Student(int id) {

	this.id = id;
}

//whenever we are using property inside xml there should be setter method wriiten  y us
//
//	public void setId(int  id) {
//		this.id = id;
//		//System.out.println("setter called "+ id);
//		//doing dependancy injection with setter method
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	//	System.out.println("setter called "+ studentName);
//
//	}
	
	public void displayStudentInfo() {
		System.out.println("student name is "+ studentName + " and id is "+id);
	}
}
