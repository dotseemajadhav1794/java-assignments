//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class EvenOddInt
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);
    int num;
    int i;
    int x = 0;
    int y = 0;
    System.out.print("How many numbers you want to input: ");
    i = input.nextInt();
    for (;;) {
        i--;
        System.out.print("Please input a number : ");
        num = input.nextInt();
        if (num % 2 == 0) {
            x = x + num;
        } else {
            y = y + num;
        }
        if (num < 0) {
            System.out.print("Inivald input");
            System.exit(0);
        }
        if (i == 0) {
            System.out.println("Sum of even numbers is : " + x);
            System.out.println("Sum of odd numbers is : " + y);
            System.exit(0);
        }
    }
	
	
	}
	}
	/*
	output
	How many numbers you want to input: 5
Please input a number : 12
Please input a number : 14
Please input a number : 16
Please input a number : 15
Please input a number : 89
Sum of even numbers is : 42
Sum of odd numbers is : 104
*/