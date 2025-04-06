import java.util.*;
class OddPrime
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size of Array:");
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  int flag,count=0;
	  System.out.println("Enter the elements of the array:");
	  for(int i=0;i<n;i++)
	  {
	    a[i]=sc.nextInt();
	  }

	for(int i=0;i<n;i++)
	  {
	    if(a[i]%2!=0)
		{
		  flag=1;
		  for(int j=2;j<a[i];j++)
		  {
			if(a[i]%j == 0)
			{
			  flag=0;
			  break;
			}
		  }
		if(flag == 1 && a[i]>1)
		{
		  System.out.println(a[i] + "is Both Odd and Prime.");
		  count++;
		}
		}
	  }
if(count == 0)
{
System.out.println("Element Not Found");
}
sc.close();
}
}
	