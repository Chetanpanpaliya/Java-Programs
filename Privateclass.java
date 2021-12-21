package Accesmodifier;
class Privateclas{
	double sum=100;
	int square(int num) {
		return num*num;
		
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
public class Privateclass {
public static void main(String[] args) {
	Privateclass object = new Privateclass();
	System.out.println(object.sum);
object.square(12);
}
}
