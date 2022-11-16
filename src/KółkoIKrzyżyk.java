import java.util.Scanner;

public class KółkoIKrzyżyk
{
	public static void main(String[] args) 
	{
		kółkoIKrzyżyk();
	}
	
	public static void kółkoIKrzyżyk()
	{
		Scanner input = new Scanner(System.in); 
		
		String[][]tablica = new String[3][3];
		
		int z = 1;
		
		String kółko = "o";
		String krzyżyk = "x";
		
		for(int i=0; i<tablica.length; i++)
		{
			for(int j=0; j<tablica[i].length; j++)
			{
				if(tablica[i][j] == null)
				{
					tablica[i][j] = " ";
				}
				System.out.print("|" +tablica[i][j]);
			}
			System.out.println("|");
		}
		while(z != 0) 
		{
			int y = 1;
			while(y != 0)
			{
				
				System.out.println("\nGracz1 wybiera wiersz z przedziału 0-2:");
				int a = input.nextInt();
				
				System.out.println("Gracz1 wybiera kolumnę z przedziału 0-2:");
				int b = input.nextInt();
				try
				{
					if(tablica[a][b] == " ")
					{
						tablica[a][b] = kółko;
						
						for(int i=0; i<tablica.length; i++)
						{
							for(int j=0; j<tablica[i].length; j++)
							{
								if(tablica[i][j] == null)
								{
									tablica[i][j] = " ";
								}
								System.out.print("|" +tablica[i][j]);
							}
							System.out.println("|");
						}
						y = 0;
					}
					else 
					{
						System.out.println("Wybierz inne pole!");
					}
				}
				catch (Exception e) 
				{
					System.err.println(e.getMessage());
				}
			}
			if((tablica[0][0] == tablica[1][0] && tablica[1][0] == tablica[2][0] && tablica[2][0] != "o" && tablica[2][0] != " ") ||
					(tablica[0][1] == tablica[1][1] && tablica[1][1] == tablica[2][1] && tablica[2][1] != "o" && tablica[2][1] != " ") ||
					(tablica[0][2] == tablica[1][2] && tablica[1][2] == tablica[2][2] && tablica[2][2] != "o" && tablica[2][2] != " ")  ||
					(tablica[0][0] == tablica[0][1] && tablica[0][1] == tablica[0][2] && tablica[0][2] != "o" && tablica[0][2] != " ")  ||
					(tablica[1][0] == tablica[1][1] && tablica[1][1] == tablica[1][2] && tablica[1][2] != "o" && tablica[1][2] != " ")  ||
					(tablica[2][0] == tablica[2][1] && tablica[2][1] == tablica[2][2] && tablica[2][2] != "o" && tablica[2][2] != " ")  ||
					(tablica[0][0] == tablica[1][1] && tablica[1][1] == tablica[2][2] && tablica[2][2] != "o" && tablica[2][2] != " ")  ||
					(tablica[0][2] == tablica[1][1] && tablica[1][1] == tablica[2][0] && tablica[2][0] != "o" && tablica[2][0] != " "))
			{
				System.out.println("Wygrał Gracz2!");
				z = 0;
			}
			else if((tablica[0][0] == tablica[1][0] && tablica[1][0] == tablica[2][0] && tablica[2][0] != "x" && tablica[2][0] != " ") ||
					(tablica[0][1] == tablica[1][1] && tablica[1][1] == tablica[2][1] && tablica[2][1] != "x" && tablica[2][1] != " ") ||
					(tablica[0][2] == tablica[1][2] && tablica[1][2] == tablica[2][2] && tablica[2][2] != "x" && tablica[2][2] != " ")  ||
					(tablica[0][0] == tablica[0][1] && tablica[0][1] == tablica[0][2] && tablica[0][2] != "x" && tablica[0][2] != " ")  ||
					(tablica[1][0] == tablica[1][1] && tablica[1][1] == tablica[1][2] && tablica[1][2] != "x" && tablica[1][2] != " ")  ||
					(tablica[2][0] == tablica[2][1] && tablica[2][1] == tablica[2][2] && tablica[2][2] != "x" && tablica[2][2] != " ")  ||
					(tablica[0][0] == tablica[1][1] && tablica[1][1] == tablica[2][2] && tablica[2][2] != "x" && tablica[2][2] != " ")  ||
					(tablica[0][2] == tablica[1][1] && tablica[1][1] == tablica[2][0] && tablica[2][0] != "x" && tablica[2][0] != " "))
			{
				System.out.println("Wygrał Gracz1!");
				z = 0;
			}
			else if(tablica[0][0] != " " && tablica[1][0] != " " && tablica[2][0] != " " &&
					tablica[0][1] != " " && tablica[1][1] != " " && tablica[2][1] != " " &&
					tablica[0][2] != " " && tablica[1][2] != " " && tablica[2][2] != " ") 
				{
					System.out.println("Remis!");
					z = 0;
				}
			else 
			{
				y = 1;
				while(y != 0)
				{
					try
					{
						System.out.println("\nGracz2 wybiera wiersz z przedziału 0-2:");
						int c = input.nextInt();
						
						System.out.println("Gracz2 wybiera kolumnę z przedziału 0-2:");
						int d = input.nextInt();
						
						if(tablica[c][d] == " ")
						{
							tablica[c][d] = krzyżyk;
							
							for(int i=0; i<tablica.length; i++)
							{
								for(int j=0; j<tablica[i].length; j++)
								{
									if(tablica[i][j]== null)
									{
										tablica[i][j] = " ";
									}
									System.out.print("|" +tablica[i][j]);
								}
								System.out.println("|");
							}
							y = 0;
						}
						else 
						{
							System.out.println("Wybierz inne pole!");
						}
					}
					catch (Exception e) 
					{
						System.err.println(e.getMessage());
					}
					if((tablica[0][0] == tablica[1][0] && tablica[1][0] == tablica[2][0] && tablica[2][0] != "o" && tablica[2][0] != " ") ||
							(tablica[0][1] == tablica[1][1] && tablica[1][1] == tablica[2][1] && tablica[2][1] != "o" && tablica[2][1] != " ") ||
							(tablica[0][2] == tablica[1][2] && tablica[1][2] == tablica[2][2] && tablica[2][2] != "o" && tablica[2][2] != " ")  ||
							(tablica[0][0] == tablica[0][1] && tablica[0][1] == tablica[0][2] && tablica[0][2] != "o" && tablica[0][2] != " ")  ||
							(tablica[1][0] == tablica[1][1] && tablica[1][1] == tablica[1][2] && tablica[1][2] != "o" && tablica[1][2] != " ")  ||
							(tablica[2][0] == tablica[2][1] && tablica[2][1] == tablica[2][2] && tablica[2][2] != "o" && tablica[2][2] != " ")  ||
							(tablica[0][0] == tablica[1][1] && tablica[1][1] == tablica[2][2] && tablica[2][2] != "o" && tablica[2][2] != " ")  ||
							(tablica[0][2] == tablica[1][1] && tablica[1][1] == tablica[2][0] && tablica[2][0] != "o" && tablica[2][0] != " "))
					{
						System.out.println("Wygrał Gracz2!");
						z = 0;
					}
					else if((tablica[0][0] == tablica[1][0] && tablica[1][0] == tablica[2][0] && tablica[2][0] != "x" && tablica[2][0] != " ") ||
							(tablica[0][1] == tablica[1][1] && tablica[1][1] == tablica[2][1] && tablica[2][1] != "x" && tablica[2][1] != " ") ||
							(tablica[0][2] == tablica[1][2] && tablica[1][2] == tablica[2][2] && tablica[2][2] != "x" && tablica[2][2] != " ")  ||
							(tablica[0][0] == tablica[0][1] && tablica[0][1] == tablica[0][2] && tablica[0][2] != "x" && tablica[0][2] != " ")  ||
							(tablica[1][0] == tablica[1][1] && tablica[1][1] == tablica[1][2] && tablica[1][2] != "x" && tablica[1][2] != " ")  ||
							(tablica[2][0] == tablica[2][1] && tablica[2][1] == tablica[2][2] && tablica[2][2] != "x" && tablica[2][2] != " ")  ||
							(tablica[0][0] == tablica[1][1] && tablica[1][1] == tablica[2][2] && tablica[2][2] != "x" && tablica[2][2] != " ")  ||
							(tablica[0][2] == tablica[1][1] && tablica[1][1] == tablica[2][0] && tablica[2][0] != "x" && tablica[2][0] != " "))
					{
						System.out.println("Wygrał Gracz1!");
						z = 0;
					}
				}
			}
		}
	}
}