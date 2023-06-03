package TicTacToe;

import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args) 
	{
		TicTacToe ttt = new TicTacToe();
		
		ttt.ticTacToe();
	}
	
	public void ticTacToe()
	{
		Scanner input = new Scanner(System.in); 
		
		String[][]tab = new String[3][3];
		
		int z = 1;
		
		String circle = "o";
		String cross = "x";
		
		for(int i=0; i<tab.length; i++)
		{
			for(int j=0; j<tab[i].length; j++)
			{
				if(tab[i][j] == null)
				{
					tab[i][j] = " ";
				}
				System.out.print("|" +tab[i][j]);
			}
			System.out.println("|");
		}
		
		while(z != 0) 
		{
			int y = 1;
			while(y != 0)
			{
				
				System.out.println("\nPlayer 1 chooses a row from the range 1-3: ");
				int a = input.nextInt();
				
				System.out.println("Player 1 chooses a column from the range 1-3: ");
				int b = input.nextInt();
				try
				{
					if(tab[a-1][b-1] == " ")
					{
						tab[a-1][b-1] = circle;
						
						for(int i=0; i<tab.length; i++)
						{
							for(int j=0; j<tab[i].length; j++)
							{
								if(tab[i][j] == null)
								{
									tab[i][j] = " ";
								}
								System.out.print("|" +tab[i][j]);
							}
							System.out.println("|");
						}
						y = 0;
					}
					else 
					{
						System.out.println("Select another field!");
					}
				}
				catch (Exception e) 
				{
					System.err.println(e.getMessage());
				}
			}
			if((tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0] && tab[2][0] != "o" && tab[2][0] != " ") ||
					(tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1] && tab[2][1] != "o" && tab[2][1] != " ") ||
					(tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2] && tab[2][2] != "o" && tab[2][2] != " ")  ||
					(tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2] && tab[0][2] != "o" && tab[0][2] != " ")  ||
					(tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2] && tab[1][2] != "o" && tab[1][2] != " ")  ||
					(tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2] && tab[2][2] != "o" && tab[2][2] != " ")  ||
					(tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != "o" && tab[2][2] != " ")  ||
					(tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] && tab[2][0] != "o" && tab[2][0] != " "))
			{
				System.out.println("Player2 won!");
				z = 0;
			}
			else if((tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0] && tab[2][0] != "x" && tab[2][0] != " ") ||
					(tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1] && tab[2][1] != "x" && tab[2][1] != " ") ||
					(tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2] && tab[2][2] != "x" && tab[2][2] != " ")  ||
					(tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2] && tab[0][2] != "x" && tab[0][2] != " ")  ||
					(tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2] && tab[1][2] != "x" && tab[1][2] != " ")  ||
					(tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2] && tab[2][2] != "x" && tab[2][2] != " ")  ||
					(tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != "x" && tab[2][2] != " ")  ||
					(tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] && tab[2][0] != "x" && tab[2][0] != " "))
			{
				System.out.println("Player 1 won!");
				z = 0;
			}
			else if(tab[0][0] != " " && tab[1][0] != " " && tab[2][0] != " " &&
					tab[0][1] != " " && tab[1][1] != " " && tab[2][1] != " " &&
					tab[0][2] != " " && tab[1][2] != " " && tab[2][2] != " ") 
				{
					System.out.println("Draw!");
					z = 0;
				}
			else 
			{
				y = 1;
				while(y != 0)
				{
					try
					{
						System.out.println("\nPlayer 2 chooses a row from the range 1-3: ");
						int c = input.nextInt();
						
						System.out.println("Player 2 chooses a column from the range 1-3: ");
						int d = input.nextInt();
						
						if(tab[c-1][d-1] == " ")
						{
							tab[c-1][d-1] = cross;
							
							for(int i=0; i<tab.length; i++)
							{
								for(int j=0; j<tab[i].length; j++)
								{
									if(tab[i][j]== null)
									{
										tab[i][j] = " ";
									}
									System.out.print("|" +tab[i][j]);
								}
								System.out.println("|");
							}
							y = 0;
						}
						else 
						{
							System.out.println("Select another field!");
						}
					}
					catch (Exception e) 
					{
						System.err.println(e.getMessage());
					}
					if((tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0] && tab[2][0] != "o" && tab[2][0] != " ") ||
							(tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1] && tab[2][1] != "o" && tab[2][1] != " ") ||
							(tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2] && tab[2][2] != "o" && tab[2][2] != " ")  ||
							(tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2] && tab[0][2] != "o" && tab[0][2] != " ")  ||
							(tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2] && tab[1][2] != "o" && tab[1][2] != " ")  ||
							(tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2] && tab[2][2] != "o" && tab[2][2] != " ")  ||
							(tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != "o" && tab[2][2] != " ")  ||
							(tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] && tab[2][0] != "o" && tab[2][0] != " "))
					{
						System.out.println("Player 2 won!");
						z = 0;
					}
					else if((tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0] && tab[2][0] != "x" && tab[2][0] != " ") ||
							(tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1] && tab[2][1] != "x" && tab[2][1] != " ") ||
							(tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2] && tab[2][2] != "x" && tab[2][2] != " ")  ||
							(tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2] && tab[0][2] != "x" && tab[0][2] != " ")  ||
							(tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2] && tab[1][2] != "x" && tab[1][2] != " ")  ||
							(tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2] && tab[2][2] != "x" && tab[2][2] != " ")  ||
							(tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != "x" && tab[2][2] != " ")  ||
							(tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] && tab[2][0] != "x" && tab[2][0] != " "))
					{
						System.out.println("Player 1 won!");
						z = 0;
					}
				}
			}
		}
		input.close();
	}
}
