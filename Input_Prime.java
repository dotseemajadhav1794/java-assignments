//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 

import java.util.*;
public class Input_Prime
{
 Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        
        // Read the user input
        int number = scanner.nextInt();
        // Check if the entered number is a prime number
        if (isPrime(number)) 
		{
            System.out.println("given number is prime ; " + number);
        } 
		else 
		{
            System.out.println("given number is not prime ; " + number);
        }
    // Function to check if a number is prime
    public static boolean isPrime(int n) 
	{
        if (n <= 1) 
		{
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
		{
            if (n % i == 0) 
			{
                return false;
            }
        }

        return true;
	}
}