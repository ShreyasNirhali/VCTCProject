import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Find PalindromeNumber
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int no = sc.nextInt();
		
		
		//int no = 121;
		int temp = no;
		int rev = 0,rem;
		
		while(temp !=0)
		{
			rem = temp % 10;       //121%10 = 1        12%10=2             1%10=1 check      reminder
			rev = rev * 10 + rem;  //0*10+ 1 = 1       1*10+2 =10+2=12     12*10+1 =121      
			temp = temp /10;       //121/10 =12        12/10 =1             1/10 =0.1        Qutient
		}
		
		if(no == rev)
		{
			System.out.println(no+" is PalindromeNumber");
		}
		else
		{
			System.out.println(no+" is not a PalindromeNumber");
		}

	}

}
