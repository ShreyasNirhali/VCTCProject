
public class ReverseEachWordInStringSamePosition {

	public static void main(String[] args) {
		// 19)Reverse Each Word In String at Same Position
		
		//Input = Java Programming     Output 
		String str = " Java Programming ";
		
		//[Java,Programming]
		
		String[] words = str.split(" ");
		String revString = "";
		
		for(int i =0; i < words.length; i++)
		{
			String word = words[i];
			String revWord = "";
			
			for(int j = word.length() -1; j>= 0 ; j--);
			{
		//		revWord =revWord + word.charAt(j);  //avaJ
			}
			
			revString = revString + revWord + " ";//avaJ gnimmargorP
			
		}
		System.out.println(revString);
	}

}
