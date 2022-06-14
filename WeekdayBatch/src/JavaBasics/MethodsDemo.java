package JavaBasics;

public class MethodsDemo {

	public void Method1() {
		System.out.println("Hello I am Method1");
	}

	public static void Method2() {
		System.out.println("Hello I am Method2");
	}

//method with return type
	// Void method does not allow return of value
	public int Method3() {
		int a = 5;
		return a;
	}

	// parametrized method
	public void Method4(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		MethodsDemo obj = new MethodsDemo();

		obj.Method1(); // For non-static method, we need to create objects to call the method.
		Method2(); // For static method, object is not needed.
		System.out.println(obj.Method3());
		obj.Method4("Sanket", 27);

	}
}
