package ExceptionProject;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		
		System.out.println("main method ended");
	}
	static void method1() {
		System.out.println("main method1 started");
		try{
			method2();}
		catch(ArithmeticException a)
		{
			System.out.println("divisible by zero is not possible");
		}
		
		
		System.out.println("main method1 ended");
		
	}
	static void method2() {
		
		System.out.println("main method2 started");
		try {
			int x=22/0;
			System.out.println(x);
		}
		finally {
			System.out.println("this is finally block");
		}
		
		System.out.println("main method2 ended");
	}

	}


