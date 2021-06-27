import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		// 21) Reverse the String using Scanner 

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String =");
		
				String a = sc.next();
				
				int lang = a.length();
				
				String rev ="";
				
				for(int i=(lang-1) ; i>=0 ; i-- )
				{
					rev = rev + a.charAt(i);
			    }
				
				System.out.println("Reversed String is = "+rev);

	}

}
