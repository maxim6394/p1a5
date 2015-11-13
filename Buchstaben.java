import java.util.*;

class Buchstaben
{
	public static void main(String... args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wort eingeben: ");
		String input = scanner.nextLine().trim();	//leerzeichen vorne und hinten entfernen

		char[] charInput = input.toCharArray();

		for(int i = 0; i<charInput.length; i++)
		{
			charInput[i] = (charInput[i] > 'Z' && charInput[i] != ' ')?(char)(charInput[i]-('a'-'A')):charInput[i];
		}

		String output = new String(charInput);
		System.out.println("\r\n"+output);


		System.out.println("------------------");

		int wortZahl = 1;

		for(int i = 1; i < input.length(); i++)
		{
			if(input.charAt(i) == ' ' && input.charAt(i-1) != ' ')
				wortZahl++;
		}

		System.out.println("Anzahl Wörter: "+wortZahl);
	}
}

