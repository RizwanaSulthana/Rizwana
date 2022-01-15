package Project2;

public class Main1 {
	public static void main(String[]args)
	{
		
	StringBuilder s1=new StringBuilder("I Like Chocolates");
	s1.replace(2,6,"Love");
	System.out.println(s1);
	
	
	StringBuilder sb=new StringBuilder();
	sb.append("Hello");
	System.out.println(sb);
	sb.insert(2, 123);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
	}
	

}
