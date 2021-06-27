import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// Find Odd Even Number
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int a = sc.nextInt();
		
		if(a % 2 == 0)
		{
			System.out.println(a+" is Even Number");
		}
		else
		{
			System.out.println(a+" is Odd Number");
		}
		
		

	}

}
