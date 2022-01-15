package arrayproject;

public class Main2 {
	public static void main (String[]args)
	{
		Test test[]=new Test[3];
		for(Test t:test)
			System.out.println(t);
		Test testarr[]= {new Test(1),new Test(32),new Test(67)};
		for(Test t:testarr)
		{
			t.display();
		}
		String cities[]= {"hyd","bnglr","pune","kolkata"};
		for(String s:cities)
			System.out.println(s);
		
		
	}

}
