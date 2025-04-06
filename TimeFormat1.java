import java.util.*;
class TimeFormat1
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Time");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  int c= sc.nextInt();
	  sc.nextLine();
	  String d = sc.nextLine();

	  if(d.equalsIgnoreCase("am"))
	  {
		if(a==12) a=0;
		System.out.println(a+":"+b+":"+c);
	  }
	  else if(d.equalsIgnoreCase("pm"))
	  {
		if(a!=12) a+=12;
		System.out.println(a+":"+b+":"+c);
	  }
	  else
	  {
	   System.out.println("Invalid Time Format . use 'am' or 'pm'.");
	  }
	}
}