
public class StringDuplicateFromArray {

	public static void main(String[] args) {
		//9) Find duplicate String from Array
		
		String a []= {"v","d","l","o","r","c","v","d","s"};
		
		
		System.out.print("Duplicate Element is : ");
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.print(a[j]+",");
				}
			}
				
			
			

}}}
