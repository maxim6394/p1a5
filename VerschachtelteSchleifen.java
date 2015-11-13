import java.util.*;

class VerschachtelteSchleifen
{
	public static void main(String... args)
	{
		System.out.println("--------- (a) ---------");
		for(int i = 1; i <= 6; i++)
		{
			for(int h = 0; h<i; h++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}		


		System.out.println("--------- (b) ---------");
		for(int i = 6; i >= 0; i--)
		{
			for(int h = 0; h<i; h++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}


		System.out.println("--------- (c) ---------");
		for(int i = 0; i < 10; i++)
		{
			for(int h = 0; h<10; h++)
			{
				if((h - i) % 2 == 0)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}



	}
}

