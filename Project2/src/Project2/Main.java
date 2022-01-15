package Project2;

public class Main {

	public static void main(String[] args) 
	{
		String s1="Hello world";
		String s2="     hello world     ";
		System.out.println(s1.charAt(3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.length());
		System.out.println(s1.replace("Hello", "Hi"));
		//System.out.println(s1);
		System.out.println(s1.substring(5,11));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.trim());
		

	}

}
