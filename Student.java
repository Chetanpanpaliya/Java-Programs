package Encapsulation;
class Student_info{
	private int stUsn;
	private String stFname;
	private String stLname;
	private int stMarks;
	private String stDept;
	private String stCity;
	//we need to create getter and setter method
	public int getStUsn() {
		return stUsn;
	}
	public void setStUsn(int stUsn) {
		this.stUsn = stUsn;
	}
	public String getStFname() {
		return stFname;
	}
	public void setStFname(String stFname) {
		this.stFname = stFname;
	}
	public String getStLname() {
		return stLname;
	}
	public void setStLname(String stLname) {
		this.stLname = stLname;
	}
	public int getStMarks() {
		return stMarks;
	}
	public void setStMarks(int stMarks) {
		this.stMarks = stMarks;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStCity() {
		return stCity;
	}
	public void setStCity(String stCity) {
		this.stCity = stCity;
	}

}

public class Student {
	

	public static void main(String[] args) {
//we need to create an object<=====class
Student_info stob = new Student_info();
stob.setStUsn(101);
stob.setStFname("Sachin");
stob.setStLname("A");
stob.setStDept("entc");
stob.setStCity("Pune");
System.out.println(stob.getStUsn());
System.out.println(stob.getStFname());
System.out.println(stob.getStLname());
System.out.println(stob.getStDept());
System.out.println(stob.getStCity());


	}

}
