import java.util.*;
public class VowelConstructor
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number of strings:");
	  int n= sc.nextInt();
	  sc.nextLine();
	  String arr[] = new String[n];
	  for(int i=0;i<n;i++)
	   {
		System.out.println("Enter String"+(i+1)+":");
		arr[i] = sc.nextLine();
	    }
		
		for(int i=0;i<n;i++)
		{
			String str = arr[i].toLowerCase();
			int vowels = 0;
			int consonants = 0;

			for(int j=0;j<str.length();j++)
			{
			  char ch = str.charAt(j);
			  if(Character.isLetter(ch))
			  {
			       	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
				vowels++;
			        }
			        else
			        {
				consonants++;
			        }
			  }
			}
		
 System.out.println("String"+(i+1)+"("+arr[i]+"): Vowels ="+ vowels + ",Consonants = "+ consonants);
}
sc.close();
}
}