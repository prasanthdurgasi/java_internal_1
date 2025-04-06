import java.util.*;
class Calculator
{
	static int objectCount = 0;
	Calculator()
	{
	  objectCount++;
	}
	
	static int powering(int num1,int num2)
	{
	  return (int)Math.pow(num1,num2);
	}
	
	static double powerDouble(double num1,double num2)
	{
	  return Math.pow(num1,num2);
	}
  	 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		System.out.println("Enter two integers(Base and exponent:");
		int baseInt = sc.nextInt();
		int ExpInt = sc.nextInt();
		int ResultInt = powering(baseInt,ExpInt);
		System.out.println(baseInt + " to the power "+ ExpInt + "is:" + ResultInt);
		System.out.println("Enter two doubles(Base and exponent:");
		Double baseDouble = sc.nextDouble();
		Double ExpDouble = sc.nextDouble();
		Double ResultDouble = powerDouble(baseDouble,ExpDouble);
		System.out.println(baseDouble + " to the power "+ ExpDouble + "is:" + ResultDouble);
		System.out.println("No.of objects Created:"+ objectCount);
	}
}
