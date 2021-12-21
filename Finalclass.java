package fina;

 class Example{
	
}
public class Finalclass extends Example{
	void method() {
		System.out.println("Subclass method");
	}
}
public class Finalclass {

	public static void main(String[] args) {
Finalclass obj = new Finalclass();
obj.method();
	}

}
