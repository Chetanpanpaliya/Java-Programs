package opp;
class Construct{
	Construct(){
		System.out.println("first constructor");
	}
}
class Childconst extends Construct{
	Childconst(){
		System.out.println("child constructor");
	}
}
public class Extentconstruvtor {

	public static void main(String[] args) {
new Childconst();
	}

}
