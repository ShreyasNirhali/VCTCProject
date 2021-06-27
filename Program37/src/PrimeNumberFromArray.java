import java.util.Scanner;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		// 17)Find Prime Number from Array
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Size of Array = ");
		int x = sc.nextInt();
		System.out.print("Enter the Array Element =");
		int a[]= new int [x];
		
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
	/*	System.out.print("The Array Elements are :");
		for (int i=0;i<x;i++)
		{
			System.out.println(a[i]+" ");
		}*/
       
		System.out.println("\nPrime number in the Array ;");
		for(int i=0;i<x;i++){
			int count =0;
		
        for(int j=2;j<a[i];j++){
        	if(a[i]%j==0) {
        		count=count+1;
        		}
        }
        if(count==0) {
        	System.out.print(a[i]+" ");
        }
			
		}
	}

}
