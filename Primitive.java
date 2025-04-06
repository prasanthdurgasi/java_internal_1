import java.util.*;
class Primitive
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number");
	  String input = sc.nextLine();
	  
  	  try
	  {
	   	long intValue = Long.parseLong(input);
		System.out.println("The number :"+ input + "can be stored in:");
		if(intValue >=Byte.MIN_VALUE && intValue <= Byte.MAX_VALUE)
		System.out.println("*Byte");
		if(intValue >=Short.MIN_VALUE && intValue <= Short.MAX_VALUE)
		System.out.println("*Short");
		if(intValue >=Integer.MIN_VALUE && intValue <= Integer.MAX_VALUE)
		System.out.println("*Int");
		if(intValue >=Long.MIN_VALUE && intValue <= Long.MAX_VALUE)
		System.out.println("*Long");
		System.out.println("*Float");
		System.out.println("*Double");
	  }
		catch(NumberFormatException e1)
		{
		  try
		  {
		   double floatValue = Double.parseDouble(input);	
		   System.out.println("The Number " + input + "is a floating number and can be stored as:");
		   if(floatValue >= -Float.MAX_VALUE && floatValue <= Float.MAX_VALUE)
		   System.out.println("*Float");
		   System.out.println("*Double");
		   }
		   catch(NumberFormatException e2)
		   {
			System.out.println("The input is too large or invalid for primitive data types");
		    }
		  }
             }
}

		