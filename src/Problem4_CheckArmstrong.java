import java.util.Scanner;

public class Problem4_CheckArmstrong {
	
	
	
	public  void checkArmstrong(int num)
	{ int last_digit=0;
	  int sumofdigit=0;
		int length=(int) (Math.log10(156)+1);

	  int holdnum=num;
	  
	  while(num>0)
	  {
		  last_digit=num%10;
		  
		 sumofdigit +=(int) (Math.pow(last_digit, length));
		  
		  num=num/10;
		  
		  
		  
	  }
	  if(holdnum==sumofdigit)
	  {
		 System.out.println("Armstrong Number");
	  }
	  else
	  {
		  System.out.println("Not Armstrong Number");
	  }
		
		
		
	}
	public static void main(String[] args) {
		
		
		  Problem4_CheckArmstrong ob=new Problem4_CheckArmstrong(); Scanner sc=new
		  Scanner(System.in); int num=sc.nextInt(); 
		  ob.checkArmstrong(num);
		 
	}
	
	

}
