import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Prime Number
		
				Scanner sc =new Scanner(System.in);
				System.out.print("Enter the Number = ");
				int x = sc.nextInt();
				
				int no = x;
				int temp = 0;
				
				for(int i=2;i<(no-1);i++)
				{
					if(no % i == 0)
					{
						temp=temp+1;
						
					}
					
				}
				if(temp == 0)
				{
					System.out.println("The number is Prime Number");
				}
				else
				{
					System.out.println("The Numer is Not a Prime Number");
				}

	}

}
