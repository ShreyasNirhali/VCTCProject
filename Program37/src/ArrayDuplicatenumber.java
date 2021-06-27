
public class ArrayDuplicatenumber {

	public static void main(String[] args) {
		
		//8) Find duplicate number from Array
		
		int a[]= {1,2,9,2,3,1,8,9};
		
		
		System.out.print("Duplicate Numbers are : ");
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if ((a[i] == a[j] ))//&& (i!=j))
				{	
				System.out.print(a[j]+ ",");	
				}
					
				
			}
			
		}

	}

}
