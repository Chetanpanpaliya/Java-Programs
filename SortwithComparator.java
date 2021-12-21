package Collections;

class Student{
	private String Sname;
	private int Srollno;
	private int Sage;
	private Student(String sname, int srollno, int sage) {
		super();
		Sname = sname;
		Srollno = srollno;
		Sage = sage;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSrollno() {
		return Srollno;
	}
	public void setSrollno(int srollno) {
		Srollno = srollno;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	
	
}

public class SortwithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
