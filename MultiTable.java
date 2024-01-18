//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
import java.util.*;
public class MultiTable
{
	public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("ENter any Positive Number =  ");
			int a =s.nextInt(); 
			for(int i=1;i<=10;i++)
			{
				System.out.println(a+" * "+i+" = "+a*i);
			}
		}
}
/* output
    ENter any Positive Number = 15
15 * 1 = 15
15 * 2 = 30
15 * 3 = 45
15 * 4 = 60
15 * 5 = 75
15 * 6 = 90
15 * 7 = 105
15 * 8 = 120
15 * 9 = 135
15 * 10 = 150
*/