
public class LargestNoFrom4 {

	public static void main(String[] args) {
	 
		// Find Largest No From 4 Numbers
		
		int a =10000;
		int b =1000;
		int c =30;
        int d =400;
		
		if(a>b)
		{
			if(a>c)
			{
			    if(a>d)
			    {
					System.out.println("a is the Biggest Number");
			    }
			    else
			    {
			    	System.out.println("d is the Biggest Number");
			    }
			}
			else
			{
				
				if(c>d)
					{
					System.out.println("c is the Biggest Number");
					}
				else
				{
					System.out.println("d is the Biggest Number");
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
					
				{
					System.out.println("b is the Biggest Number");
				}
				else
				{
					System.out.println("d is the Biggest Number");
				}
			}
			else
			{
				if(c>d)
			    {
				  System.out.println("c is the Biggest Number");
			    }
				else
				{
			      System.out.println("d is the Biggest Number");
				}
		     }
	}

}}
