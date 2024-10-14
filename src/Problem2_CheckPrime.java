import java.util.Scanner;

public class Problem2_CheckPrime {
	
	public static void checkPrime(int num)
	{  
		if(num==1 || num==0)
	    {
		System.out.println("Not Prime not composite");
		return;
	    }
		if(num==2)
		{
			System.out.println("Prime");
			return;
		}
		
		boolean result=true;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
			 result=false;
			 break;
			}
			
		}
		
		if(result==true)
		{
			System.out.println("Prime");	
		}
		else {
			System.out.println("Not prime");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("hi");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		checkPrime(num);
	}
}


