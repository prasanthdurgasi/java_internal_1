import java.util.*;
public class AnagramChecker
{
	public static Boolean areAnagrams(String str1, String str2)
	{
	  str1 = str1.replaceAll("\\s","").toLowerCase();
	  str2 = str2.replaceAll("\\s","").toLowerCase();
	  if(str1.length() != str2.length())
	  {
	    return false;
	   }

		char charArray1[] = str1.toCharArray();
		char charArray2[] = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1,charArray2);
	}
		public static void main(String[] args)
		{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter first string:");
		  String str1 = sc.nextLine();
		  System.out.println("Enter second string:");
		  String str2 = sc.nextLine();

			if(areAnagrams(str1,str2))
			{	
			  System.out.println("The Strings are Anagrams");
			}
			else
			{
			  System.out.println("The Strings are NOT Anagrams");
			}
  sc.close();
	}
}

