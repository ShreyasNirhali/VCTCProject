
public class ArrayLagestnumber {

	public static void main(String[] args) {
		 
		//10) Find the Largest Number Of Array
		
		int a [] = {5,2,7,8,1};
		
		int max =a[0];
		
		for (int i=1; i<a.length; i++)
		{
		
			
			 if (a[i] > max)
			{
			 max = a[i] ;
			}
			
		}
		
		System.out.println("Largest Number is = "+ max);
		
		
	}

}
