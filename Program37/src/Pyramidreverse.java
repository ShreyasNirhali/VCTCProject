
public class Pyramidreverse {

	public static void main(String[] args) {
		// Make it bigger 
		
		for(int a=1;a<=10;a++)
		 {
			 for(int b=1;b<=a;b++)
			 {
				 System.out.print(" ");
			 }
			 for(int c=10;c>=a;c--)
			 {
				 System.out.print("* ");
			 }
			     System.out.println();
		 }
	}

}
