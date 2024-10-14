import java.util.Scanner;

public class Problem3_CheckleapYear {
	public static void checkLeapYear(int year)
	{
		if((year%400==0) ||(year%4==0 && year%100!=0))
		{
			System.out.println("Leap");
		}
		else
		{
			System.out.println("Not Leap");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		checkLeapYear(year);
	}

}
