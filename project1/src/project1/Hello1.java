package project1;


	import java.util.Scanner;

	public class Hello1
	{
		public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum of the number 1 to " +n);
		System.out.println(sum);
		
		int j=0;
		System.out.println("all the odd number from 1 to " +n);
		while(j<=n)
		{
			if(j%2!=0)
			{
			//	System.out.println("all the odd number from 1 to " +n);
			     System.out.println(j);
			
			}
			//System.out.println(j);
			j++;
		}
		//System.out.println("all the odd numbers from 1 to " +n);
		//System.out.println(j);

		
	}
	}


