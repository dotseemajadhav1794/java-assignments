//Java Program to Reverse a Number
public class Reverse
{
	public static void main(String[] args)
	{
		int number = 123456789, reverse = 0;
		System.out.println("The number to be reversed is : " + number);		
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
}