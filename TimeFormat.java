class TimeFormat
{
	public static void main(String[]args)
	{
	  int a,b,c;
	  System.out.println("Enter the Time");
	  a=Integer.parseInt(args[0]);
	  b=Integer.parseInt(args[1]);
	  c=Integer.parseInt(args[2]);

	  if(args[3].equalsIgnoreCase("am"))
	  {
		if(a==12) a=0;
		System.out.println(a+":"+b+":"+c);
	  }
	  else if(args[3].equalsIgnoreCase("pm"))
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