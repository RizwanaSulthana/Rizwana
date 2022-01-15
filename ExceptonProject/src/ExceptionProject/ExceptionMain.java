package ExceptionProject;

public class ExceptionMain {
	public static void main(String[]args)
	{
		  int x=10;
		  int y=0;
		  try{
			  
			  int result=x/y;
			  System.out.println("result:" +result);
			  
			  
			  int arr[]= {12,3,2,4,5,7};
			  System.out.println(arr[3]);
			  }
		     
		  
		  catch(ArithmeticException ex)
		  {
			  System.out.println("divisible by zero is not possible");
			  
		  }
		  catch(ArrayIndexOutOfBoundsException aex)
		  {
			  System.out.println(aex.getMessage());
			  
			  
		  }
		  System.out.println("task completed");
	}

}
