package javaString;

public class Staticclass {
	static String str="Sachin";
	static class Nestedclass{

		public void display() {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
Staticclass.Nestedclass object = new Staticclass.Nestedclass();
object.display();
	}

}
