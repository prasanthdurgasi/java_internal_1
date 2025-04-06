import java.util.*;
class HighestDemand
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of financial years (m):");
	int m = sc.nextInt();
	System.out.println("Enter number of item IDs (n):");
	int n = sc.nextInt();
	int sales[][] = new int[m][n];
	System.out.println("Enter sales data(number of items sold):");
	for(int i=0;i<m;i++)
	{
	   System.out.println("Year "+(i+1)+":");
		for(int j=0;j<n;j++)
		{
		  System.out.println("Item ID " + (j+1) +":");
		  sales[i][j] = sc.nextInt();
		}
	}


	int maxSales = sales[0][0];
	int maxYear=0;
	int maxItemId=0;
	
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(sales[i][j]>maxSales)
			{
			  maxSales = sales[i][j];
			  maxYear  = i;
			  maxItemId = j;
			}
		
		}
	}
System.out.println("\n Item with highest demand:");
System.out.println("Financial Year:"+(maxYear + 1));
System.out.println("Item ID:"+ (maxItemId + 1));
System.out.println("Number of Items sold:" + maxSales);
    }
}