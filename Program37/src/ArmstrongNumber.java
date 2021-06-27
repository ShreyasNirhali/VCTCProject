import java.util.Scanner;

public class ArmstrongNumber {
	// 2) 1)Armstrong number while 3-digit ( While Loop )
	
	public static void ArmstrongNumber(int num) {
		//153 = 1*1*1 + 5*5*5* + 3*3*3
		
		int r;
		int t;
		t = num;
		int cube =0;
		
		
		while(num>0)
		{
			r=num%10;                      //by this we always get last digit of number = 3       REMINDER
			num=num/10;                    //15 it avoid number after                              QUTIANT.
			cube= cube + (r*r*r);          //27
					
		}
		if(t==cube)
		{
			System.out.println( t +" This Number is an Armsrtong Number");
		}
		else
		{
			System.out.println(t +" is not an ArmStrong Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number = ");
		
		ArmstrongNumber(sc.nextInt());
            
	}

}
