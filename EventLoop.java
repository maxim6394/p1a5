import java.util.*;

class EventLoop
{
	public static void main(String... args)
	{
		Scanner scanner = new Scanner(System.in);

		
		String str;
		System.out.println("Was willst du? [a, b, c, q]");
		while ( !((str = scanner.next()).charAt(0)=='q') )
		{
			System.out.println("Du hast "+str.charAt(0)+" gewählt.");	
			System.out.println("Was willst du? [a, b, c, q]");
		}
			
	}
}

