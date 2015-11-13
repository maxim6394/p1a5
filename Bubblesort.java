import java.util.*;

class Bubblesort
{
	public static void main(String... args)
	{
		Random r = new Random();

		int[] arr = new int[10];

		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(20);
			System.out.print("	"+arr[i]);
		}

		System.out.println("\r\n--------------------------");

		 for (int n=arr.length; n>1; n--)
		 {
		    for (int i=0; i<n-1; i++)
		    {
		      if (arr[i] > arr[i+1])
		      {
		        int temp = arr[i];
		       	arr[i] = arr[i+1];
		       	arr[i+1] = temp;
		      } 
		    } 
		  } 

		for(int i = 0; i<arr.length; i++)
		{
			System.out.print("	"+arr[i]);
		}		

		System.out.println("\r\n--------------------------");
	}
}

