//Java Program to Find GCD

import java.util.*;
public class GCD
{
	public static void main(String[] args)
	{
		Scanner gc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a =gc.nextInt();
		System.out.println("Enter second number");
		int b =gc.nextInt();
		//int a=12,b=16;
		int i,gcd=1;
		for(i=1;i<=a&&i<=16;i++)
		{
			if(a%i ==0 && b%i ==0)
			gcd=i;
		}
		System.out.println("GCD of given number = "+gcd);
	}
}