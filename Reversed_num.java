//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
//For example, if the input is 12345, the output should be 54321.

import java.util.*;

public class Reversed_num
{
	public static void main (String[] args)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int number  = r.nextInt();
		int  reverse = 0;	
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
/*
  output
  Enter any number =
478965
The reverse of the given number is: 569874
*/