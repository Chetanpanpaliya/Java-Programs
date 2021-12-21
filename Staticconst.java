package javaString;

public class Staticconst {
	
	public Staticconst() {
		System.out.println("Static constructor");
	}

public class childclass extends cconst{
	public cconst(){
	
		System.out.println("static");
}
	public void Display() {
		System.out.println("jus a method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cconst object = new cconst();
		object.Display();
	}

}
