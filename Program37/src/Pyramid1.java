
public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=0;a<10;a++)
		 {
			 for(int b=9;b>=a;b--)
			 {
				 System.out.print(" ");
			 }
			 for(int c=1;c<=(2*a+1);c++)
			 {
				 System.out.print("*");
			 }
			     System.out.println();
		 }
	}

}
