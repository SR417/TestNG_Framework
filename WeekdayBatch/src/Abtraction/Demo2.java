package Abtraction;

public class Demo2 extends Demo1 {

	@Override
	public void method2() {
		System.out.println("I am abstract method");

	}

	public static void main(String[] args) {

		Demo2 obj = new Demo2();
		obj.method2();
		obj.method1();

	}

}
