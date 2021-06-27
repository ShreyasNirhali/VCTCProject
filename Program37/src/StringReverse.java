
public class StringReverse {

	public static void main(String[] args) {
		
		// 20) Reverse the String 

		String a = "Velocity";
		
		int lang = a.length();
		
		String rev ="";
		
		for(int i=(lang-1) ; i>=0 ; i-- )
		{
			rev = rev + a.charAt(i);
				
		}
		System.out.println("Reverse of "+a+" is "+rev);
	}
}
//without using third varibale
//a=10 b=20
//a=a+b=10+20=30
//b=a-b=30-20=10
//a=a-b=30-10=20

//with using 3rd variable
//a=10
//b=30
//temp=b   temp=30
//b=a      b=10
//a= temp  a=30