package Project2;

public class Main2 {
	public static void main(String[]args)
	{
		String s1="";
		long start=System.nanoTime();
		for(char ch='A';ch<='Z';ch++)
		{
			s1=ch+s1;
			
		}
		System.out.println(s1);
		long end=System.nanoTime();
		System.out.println("time taken " +(end-start) +" seconds ");
		StringBuilder sb=new StringBuilder("");
		start=System.nanoTime();
		for(char ch='A';ch<='Z';ch++)
		{
			sb.insert(0,ch);
			
		}
		System.out.println(sb);
		end=System.nanoTime();
		System.out.println("time taken " +(end-start) +" seconds ");
		
	}

}
