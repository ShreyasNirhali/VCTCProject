import java.util.Scanner;

public class ArmstrongNumber2{
	
	public static void main(String[] args) {

		//2) 2) 4 digit Armstrong Number Program ( While loop )
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n =sc.nextInt();
		
		int temp = n;
		int r, sum =0;
		
		while(n>0)
		{
			r = n%10;
			n = n/10;
			sum = sum + (r*r*r*r);
	    }
		
		if(temp == sum)
	         System.out.println("this is a Armstorng number");
		else
			 System.out.println("Not an Armstrong number");
	}	
}
