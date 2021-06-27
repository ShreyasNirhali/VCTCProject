import java.util.Scanner;

public class LCMandHCF {

	public static void main(String[] args) {
		// 14) Find LCM & HCF Number
		
		int a,b,x,y,t,gcd,lcm;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number = ");
		x = sc.nextInt();
		System.out.print("Enter the Second Number = ");
		y = sc.nextInt();
		
		a=x;
		b=y;
		
		while (b != 0) 
		{
			t=b;
			b=a%b;
			a=t;
		}
		gcd = a;
		lcm =(x*y)/gcd;
		
		System.out.println("HCF = "+gcd);
		System.out.println("LCM = "+lcm);

	}

}
