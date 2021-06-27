import java.util.Scanner;

public class try2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.:");
		int num=sc.nextInt();
		int n=0,q=num,r=num,len=0;		//num is assign to q,r because main value shouldn't affect
		
		for(int i=1;r%10!=0;i++)		//calculating total digit(length) in Number
		{
			r=r/10;
			len=i;
		}
		System.out.println("Lenght of Number="+len);
				
		//Armstrong logic
		for(int i=0;i<len;i++)			//loop repeated len times
		{
			r=q%10;						//r=reminder of main number(initially q=num)
			q=q/10;						//q=quotient of main number(initially q=num)
			int n2=1;					
			for(int j=0;j<len;j++)		//multiplication each digit len times
			{
				n2=n2*r;				//result store in n2
			}
			System.out.println(len+"power("+r+")="+n2);
			n=n+n2;						//Main logic of Armstrong
			
		}
		if(num==n)
		{
			System.out.println(num+" is Armstrong Number");
		}
		else
		{
			System.out.println(num+" is NOT Armstrong Number");
		}

}
}