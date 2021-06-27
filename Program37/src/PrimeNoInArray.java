import java.util.Scanner;

public class PrimeNoInArray {

	public static void main(String[] args) {
	     //difficult
		// Find Prime No from Array
		//https://www.youtube.com/watch?v=nnY1jP6ZNdM
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array: ");
		
        int size = sc.nextInt();
        
        System.out.print("Enter the Array element: ");
        
        int a[] = new int[size];
        
        for(int i=0;i<size;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.print("The Array Element are: ");
        
        for(int i=0;i<size;i++)
        {
        	System.out.print(a[i]+ " ");
        }
        System.out.print("\n Prime number in the Array are : ");
        
        for(int i=0;i<size;i++) {
        	int count=0;
        	for(int j=2;j<a[i]-1;j++) {
        		if(a[i]%j==0) {
        			count=count+1;	
        		}
        	}
        	if(count==0) {
        		System.out.print(a[i]+ " ");
        	}
        }
	}

}
