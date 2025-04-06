import java.util.*;
class PlayerGame
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of games:");
	  int n = sc.nextInt();
	  int player1[] = new int[n];
	  int player2[] = new int[n];
	  int player1_wins = 0; 
	  int player2_wins = 0;
	  int draws = 0;
	  System.out.println("Enter points of player A:");
	  for(int i=0;i<n;i++)
	  {
	   player1[i] = sc.nextInt();
	  }
	  System.out.println("Enter points of player B:");
	  for(int i=0;i<n;i++)
	  {
	   player2[i] = sc.nextInt();
	  }

	  for(int i=0;i<n;i++)
	  {
		if(player1[i] > player2[i])
		{
		  player1_wins++;
		}
		else if(player2[i] > player1[i])
		{
		  player2_wins++;
		}
		else
		{
		   draws++;
		}
	  }
     
		System.out.println("Player A wins "+ player1_wins + "times");
		System.out.println("Player B wins "+ player2_wins + "times");
		System.out.println("No of Draws "+ draws);
	sc.close();
      }
}


