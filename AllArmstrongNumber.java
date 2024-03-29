// Q 13 = Write a program to print out all Armstrong numbers between 1 and 500. 
/*If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
*/

public class AllArmstrongNumber
{
    public static void main(String[] args)
    {
        int digit1,   
            digit2, 
            digit3; 

	for(int number = 1; number <= 500; number++)
	{
            int temp = number;
	    digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;
            
            temp = temp / 10;
            digit3 = temp % 10;

	    if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
            {
	        System.out.println(number);
            }
	}
    }  
}
/*
output
armstrong number between 1- 500 are
1
153
370
371
407
*/