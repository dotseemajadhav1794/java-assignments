//Write a program to find the factorial value of any number entered through the keyboard. 

import java.util.*;
public class FactorialNum
{
	public static void main(String[] args)
	{
		Scanner A = new Scanner(System.in);
		System.out.println("Enter any number  = ");
		int fact = A.nextInt();
		for(int i=1; i<=A;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}