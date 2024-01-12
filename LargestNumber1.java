//Java Program to Find Largest Number Among Three Numbers
import java.util.*;
public class LargestNumber1
{
	public static void main(String[] args)
	{
		Scanner ln = new Scanner(System.in);
		System.out.println("Enter first number a");
		int a=ln.nextInt();
		System.out.println("Enter second number b");
		int b=ln.nextInt();
		System.out.println("Enter third number c");
		int c=ln.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
	}
}