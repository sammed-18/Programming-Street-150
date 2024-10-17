import java.util.Scanner;

public class Problem5_Fibonacci {
	
	
	public void printFibbonacciSeries(int range)
	{
		int num1=0;
		int num2=1;
		
		for(int i=0;i<range;i++)
		{
			System.out.print(num1+" ");
			int num3=num2+num1;
			num1=num2;
			num2=num3;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		Problem5_Fibonacci pf=new Problem5_Fibonacci();
		pf.printFibbonacciSeries(range);
		
		
		
	}

}
