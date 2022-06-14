package JavaBasics;

public class StringOperations {
	public static void main(String[] args) {
		
		String s="  Sanket is a my a name  ";
		System.out.println(s);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.indexOf('a', 2));
		System.out.println(s.contains("test"));
		System.out.println(s.equals("Sanket is a my a name"));
		System.out.println(s.trim() +"Test");
		System.out.println(s.replace('a', 'y'));
		
		String a="Sanket";
		String b="Jadhav";
		String c="My name is \"Sanket\"";
		System.out.println(a+" "+b);
		System.out.println(a.concat(" "+b));
		System.out.println(c);
		
		String d="My name is Sanket";
		System.out.println(d.substring(3, 10));
		
		String e="I love \"Football\"";
		System.out.println(e);
		
		
		
		
		//contains, equals, trim
		
	}

}
