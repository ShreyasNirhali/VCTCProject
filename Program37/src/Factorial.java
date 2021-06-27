import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//7) To find the factorial of number
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int a =sc.nextInt();
		
		int fact = 1;
		
		for(int i=1 ; i<= a; i++ )
		{
			fact = fact*i;
		}
        System.out.println("Factorial of the number "+a+"!"+" = "+ fact);
	}

}
