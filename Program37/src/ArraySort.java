
public class ArraySort {

	public static void main(String[] args) {
		// Sort Array in descending Order
	     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
            
           
        for (int i = 0; i < arr.length; i++) {     
            
        	for (int j = i+1; j < arr.length; j++) {     
               
        		if(arr[i] < arr[j]) {    //5<8
                   temp = arr[i];    //temp = 5
                   arr[i] = arr[j];  //arr[i]= 8
                  
                   arr[j] = temp;// arr[j]=5    
               }     
            }     
        }
        System.out.print("Array sorted in descending order: "); 
        
        for (int i = 0; i < arr.length; i++) {     
           
        	System.out.print(arr[i] + " ");    
        }    


	}

}
