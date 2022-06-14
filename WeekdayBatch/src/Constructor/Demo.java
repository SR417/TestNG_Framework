package Constructor;

public class Demo {

	int x;
	int y;
	String z;

//0 argument constructor
	public Demo() {

		x = 5;
		System.out.println(x);

	}

	// Parameterized constructor
	public Demo(int NewValue) {

		this.y = NewValue;
		System.out.println(y);

	}
	
	// Constructor is a special method.
	// Constructor name will always same as class name and does not have return type.
	// Compiler will create default constructor if you don't specify constructor.
	// if you don't specify any value to variable, default constructor will assign
	// default values to them ands return.
	// We can overload the constructor.
	// We cannot override the constructor.

	public static void main(String[] args) {

		Demo obj = new Demo();
		Demo obj1 = new Demo(6);
		System.out.println(obj.z);

	}

}
