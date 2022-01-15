package genericproject;

public class Main1 {
	
	public static void main(String[]args)
	{
		
		GenericStore<String> ss=new GenericStore<String>("message1");
		System.out.println(ss.getData());
		
		ss.save("message2");
		System.out.println(ss.getData());
		
		System.out.println("====================");
		
		GenericStore<Integer> is=new GenericStore<Integer>(100);
		System.out.println(is.getData());
		
		is.save(500);
		System.out.println(is.getData());
		
		System.out.println("=====================");
		GenericStore<Float> f=new GenericStore<Float>(100.00f);//we use wrapper class//
		System.out.println(f.getData());
		
		f.save(500.00f);
		System.out.println(f.getData());
	}

}
