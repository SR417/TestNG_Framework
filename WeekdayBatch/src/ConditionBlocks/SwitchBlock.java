package ConditionBlocks;

public class SwitchBlock {

	public static void main(String[] args) {

		int day = 4;

		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");

		default:
			System.out.println("I am default");

		}
		
		int level=0;
		String levelString= "Expert";
		
		switch (levelString) {
			
		case "Beginner":level=1;
		break;
		
		case "Intermidiate":level=2;
		break;
		
		case "Expert":level=3;
		break;
		
		}
		System.out.println("Your level is:" + level);

	}

}
