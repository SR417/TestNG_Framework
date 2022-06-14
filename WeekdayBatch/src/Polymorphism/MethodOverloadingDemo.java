package Polymorphism;

public class MethodOverloadingDemo {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void adition(double a, double b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {

		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.addition(10, 60);
		obj.adition(10.5, 11.5);
	}

}
