//Write a program to find the factorial value of any number entered through the keyboard. 

import java.util.*;
public class FactNum
{
	public static void main(String[] args)
	{
	   Scanner A = new Scanner(System.in);
		System.out.println("Enter any number  = ");
		int num = A.nextInt();
		int fact=1;
		for(int i=1; i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of entered number is = " + fact);
	}
}
/*
Enter any number  =
5
Factorial of entered number is = 120
*/