//Write a program to print numbers from 1 to 10.
public class Number
{
	public static void main(String[] args)
	{
		int i=1;
		for(i=1;i<=10;i++)
		{
			i=i++;
			System.out.println(i);
		}
	}
}

/*output
	Printing the numbers from 1 to 10 : 
1
2
3
4
5
6
7
8
9
10
*/