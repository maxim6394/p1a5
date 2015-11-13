import java.util.*;

class Haeufigkeiten
{
	public static void main(String... args)
	{
		Random r = new Random();

		int[] arr = new int[10];
		int[] arr2 = new int[10];

		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(20);
			System.out.print("	"+arr[i]);
		}

		System.out.println("\r\n--------------------");

		for(int i = 0; i<arr2.length; i++)
		{
			arr2[i] = r.nextInt(10);
			System.out.print("	"+arr2[i]);
		}
		System.out.println("\r\n--------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcher Wert soll gezählt werden? ");
		int wert = scanner.nextInt();
		int haeufigkeit = 0;
		boolean duplikat = false;
		int[] haeufigkeiten = new int[10];


		for(int i = 0; i<arr.length; i++)
		{
			for (int h = i+1; h<arr.length; h++)
			{
				if(arr[h] == arr[i])
				{
					duplikat = true;
					break;	//innere schleife abbrechen
				}
			}

			if(arr[i] == wert)
			{
				haeufigkeit++;
			}
		}	

		for(int i = 0; i<arr2.length; i++)
		{
			for(int h = 0; h<arr2.length; h++)
			{
				if(arr2[i] == arr2[h])
				{
					haeufigkeiten[i]++;
				}
			}
		}

		System.out.println("Haeufigkeit: "+haeufigkeit);	

		System.out.println("Duplikat?: "+duplikat);	

		System.out.println ("-------------------------");

		
		System.out.println("--------");

		int indexGroessteHaeufigkeit = 0;
		for(int i = 0; i<haeufigkeiten.length; i++)
		{
			if(haeufigkeiten[i]>haeufigkeiten[indexGroessteHaeufigkeit])
				indexGroessteHaeufigkeit = i;
		}
		
		System.out.println("Die am haeufigsten vorkommende Zahl: "+arr2[indexGroessteHaeufigkeit]);
		

	}
}

