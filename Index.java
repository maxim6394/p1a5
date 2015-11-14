import java.util.*;

class Index
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

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcher Wert soll gesucht werden? ");
		int wert = scanner.nextInt();

		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == wert)
			{
				System.out.println( "Ist an Position: "+i);
				break;
			}
		}		

	}
}

