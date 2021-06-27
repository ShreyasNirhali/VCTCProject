
public class Diamond2 {

	public static void main(String[] args) {
		// Make it bigger 
		
		for(int a=1;a<=7;a++)
		 {
			 for(int b=6;b>=a;b--)
			 {
				 System.out.print(" ");
			 }
			 for(int c=1;c<=a;c++)
			 {
				 System.out.print("*");
			 }
			     System.out.println();
		 }
		
		for(int a=1;a<=6;a++)
		 {
			 for(int b=1;b<=a;b++)
			 {
				 System.out.print(" ");
			 }
			 for(int c=6;c>=a;c--)
			 {
				 System.out.print("*");
			 }
			     System.out.println();
		 }
	}

}
