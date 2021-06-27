
public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series
		

		 int a = 0;
		 int b = 1;
		 
		int c;
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++)
		{
			c=a+b;                         //c=0+1=1     //c=1+1=2   //c=1+2=3    //c=2+3=5
			System.out.print(" "+c);
			a=b;                           //a=1         //a=1       //a=2        //a=3
          b=c;                             //b=1         //b=2      //b=3         //b=5
          
		}
	}

}
