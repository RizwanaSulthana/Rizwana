package genericproject;

public class Main {
	public static void main(String[]args)
	{
		StringStore ss=new StringStore("message1");
		System.out.println(ss.getData());
		
		ss.save("message2");
		System.out.println(ss.getData());
				
	}

}
