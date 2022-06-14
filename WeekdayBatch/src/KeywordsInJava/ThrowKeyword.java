package KeywordsInJava;

public class ThrowKeyword {

	public static void main(String[] args) {

		int age = 10;

		if (age < 15) {

			throw new ArithmeticException("Acces Denired");

		} else {
			System.out.println("Access granted");
		}
	}

}
