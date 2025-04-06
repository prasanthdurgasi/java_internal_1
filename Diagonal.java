import java.util.*;
class Diagonal
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size of Array:");
	  int n = sc.nextInt();
	  int a[] = new int[n*n];
	  System.out.println("Enter elements:");
	  for(int i=0;i<n*n;i++)
	  {
	   a[i] = sc.nextInt();
 	  }
	System.out.println("The leading Diagonal elements:");
	for(int j=0;j<n*n;j+=(n+1))
	{
	 System.out.println(a[j]);
	}
	sc.close();
   }
}