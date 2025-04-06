import java.util.*;
class DiagonalDifference
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size of matrix");
	  int n = sc.nextInt();
	  int a[][] = new int[n][n];
	  int d1=0;
	  int d2=0;
	  System.out.println("Enter elements in array:");
	  for(int i=0;i<n;i++)
		{
		  for(int j=0;j<n;j++)
		   {
 			a[i][j] = sc.nextInt();
		    }
		}

	for(int i=0;i<n;i++)
	{
	  d1+=a[i][i];
	  d2+=a[i][n-i-1];
	}
	int diff = Math.abs(d1-d2);
	System.out.println("Absolute difference between diagonals:" + diff);
        sc.close();
	}
 }

	