// Q 14 Write a program to print Fibonacci series of n terms where n is input by user :

import java.util.*;

public class FiboSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;

        int firstTerm = 0,
            secondTerm = 1,
            thirdTerm;
 
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
 
        System.out.print(firstTerm + " " + secondTerm + " ");
 
        for(int i = 3; i <= number; i++)
	{
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
	}
    }  
}
/*
output
Enter number of terms of series : 10
0 1 1 2 3 5 8 13 21 34
*/