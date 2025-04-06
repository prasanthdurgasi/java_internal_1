import java.util.*;
class Frequency
{
	public static void main(String[]args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of Elements:");
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  boolean[] visited = new boolean[n]; 
	  System.out.println("Enter Elements:");
	  for(int i=0;i<n;i++)
	  {
	   a[i] = sc.nextInt();
	   visited[i] = false;
	  }
	
	  System.out.println("Frequencies:");
	  for(int i=0;i<n;i++)
	  {
		if(visited[i])	
		{
		 continue;
		}

		int count = 1;
		for(int j=i+1 ;j<n;j++)
		 {
	          if(a[i] == a[j])
			{
			  count++;
			  visited[j] = true;;
			 }
		}

	System.out.println(a[i]+"-->"+ count);
	}
     }
}