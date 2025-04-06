import java.util.*;
class Marks1
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Marks for Three Subjects");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  int c = sc.nextInt();
	  float percentage = (a+b+c)/3;
	  double percent   = (a+b+c)/3;
	  if(percentage > 70.0)
	  System.out.println("Distinction");
	  else if(percentage > 60.0 && percentage < 70.0)
	  System.out.println("First class");
 	  else if(percentage > 50.0 && percentage < 60.0)
	  System.out.println("Second class");
	  else if(percentage > 40.0)
	  System.out.println("PASS");
	  else
	  {
	   System.out.println("FAIL");
 	  }
	  System.out.println("float percentage :"+percentage);
	  System.out.println("double percent :"+percent);
 	}
}