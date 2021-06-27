import java.util.Scanner;

public class StringToSeqOfCharecter {

	public static void main(String[] args) {
		
		// 6) 1)Convert the given String into Sequence of Character


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Word = ");
		
		String a = sc.next();
		
		int i = a.length();
		char b []= new char[i];
		
		
		for(int j=0;j<a.length();j++)
		{
			b[j]= a.charAt(j);
		}
		System.out.print("Sequence of Characters are =");
		for(int j=0;j<b.length;j++)
		{
			
		System.out.print(b[j]+",");
		}
	}

}
