//Java Program to Find Largest Number Among Three Numbers
public class LargestNumber
{
	public static void main(String[] args)
	{
		int a=12,b=5,c=24;
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
	}
}