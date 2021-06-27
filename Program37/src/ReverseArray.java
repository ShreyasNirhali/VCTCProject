
public class ReverseArray {

	public static void main(String[] args) {
		// 22) Reverse the Array
		
		int Array1 [] =new int[] {11,22,33,44,55,66,77,88,99,111};
		
		System.out.print("The Original Array is :");
		
		for(int i=0;i<Array1.length;i++)
		{
		    System.out.print(Array1[i]+" ");
		
		}
		
		System.out.println();
		
		System.out.print("The Reversed Array is :");
		
		for(int i=(Array1.length-1);i>=0;i--)
		{
			System.out.print(Array1[i]+" ");
		}

	}

}
