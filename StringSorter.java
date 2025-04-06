import java.util.*;
class StringSorter
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the string:");
	  String s = sc.nextLine();
	  System.out.println("Enter the value of n:");
	  int n = sc.nextInt();
		if(n <= 0 || n > s.length())
		{
		  System.out.println("Input value should be between 1 and length of String");
		  return;
		 }
		int numSubString = s.length()-n+1;
		String substrings[] = new String[numSubString];
		
		for(int i=0;i<numSubString;i++)
		{
		  substrings[i] = s.substring(i,i+n);
		}
		Arrays.sort(substrings);
		System.out.println("Sortd substrings: "+ Arrays.toString(substrings));
		sc.close();
	}
}