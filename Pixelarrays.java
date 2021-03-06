import java.util.*;

class Pixelarrays
{


static char[][] image = {
{'#',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#'},
{'#',' ',' ','#',' ',' ','#',' ','#',' ',' ','#',' ',' ',' ','#'},
{'#',' ',' ','#',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#'},
{'#',' ',' ','#',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#'},
{'#','#','#','#',' ','#','#','#','#','#',' ','#',' ','#',' ','#'},
{'#',' ',' ','#',' ','#',' ',' ',' ','#',' ','#',' ','#',' ','#'},
{'#',' ',' ','#',' ','#',' ',' ',' ','#',' ','#','#',' ','#','#'},
{'#',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ','#',' ','#',' '},
{'#',' ',' ','#',' ','#',' ',' ',' ','#',' ',' ','#',' ','#',' '}};

	public static void main(String... args)
	{
		System.out.println("Breite / Hoehe: "+image[0].length+" / "+image.length);		
	
		System.out.println("------------------------");

		int weissePixel = 0, schwarzePixel = 0;		
		for(char[] zeile : image)
		{
			for(char c : zeile)
			{
				if(c != '#')
					weissePixel++;
				else
					schwarzePixel++;

				System.out.print(c);
			}
			
			System.out.println("");
		}
		System.out.println("weisse Pixel: "+weissePixel); 
		System.out.println("schwarzePixel Pixel: "+schwarzePixel);

		System.out.println("---------- (a) -----------");

		char[][] gespiegelt = new char[image.length][image[0].length];

		for(int i = 0; i<image.length; i++)
		{
			for(int h = 0; h < image[i].length; h++)
			{
				gespiegelt[i][h] = image[i][image[i].length-1 - h];
			}

			for(char c : gespiegelt[i])
			{
				System.out.print(c);
			}
			System.out.println("");
		}


		System.out.println("---------- (b) -----------");

		char[][] rotiert = new char[image[0].length][image.length];

		for(int zeile = 0; zeile<image.length; zeile++)
		{
			for( int zeichen = image[zeile].length-1; zeichen >= 0; zeichen--)
			{
				rotiert[image[0].length-1 - zeichen][zeile] = image[zeile][zeichen];	//zeilen und spalten werden vertauscht --> rotation um 90°
			}

		}

		for(char[] zeile : rotiert)
		{
			for(char c : zeile)
			{
				System.out.print(c);
			}
			
			System.out.println("");
		}

	}
}


