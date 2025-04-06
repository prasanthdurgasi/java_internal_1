import java.util.*;
public class ReverseAlternateStrings
{
	public static String reverse(String word)
	{
	  StringBuilder reversed = new StringBuilder(word);
	  return reversed.reverse().toString();
	}	

	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of strings:");
	  int n = sc.nextInt();
	  sc.nextLine();
		String strings[] = new String[n];
		StringBuilder result = new StringBuilder();
		System.out.println("Enter the strings:");
		for(int i=0;i<n;i++)
		{
		 strings[i] = sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
		         if(i%2==0)
			{
			  result.append(strings[i]);
			 }
		          else
			{
			  result.append(reverse(strings[i]));
			}
		}
	System.out.println("Final Output String:"+result.toString());
	sc.close();
	}
}