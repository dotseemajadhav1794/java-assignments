//Java Program to Check Whether a Number is Prime or Not.
//Java Program to Check Prime Number By Creating a Function
import java.util.*;
public class Prime
{
	void primenum()
	{
		int i;
		int num=17;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(i==num)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");
		}
	}
	public static void main(String[] args)
	{
		Prime p= new Prime();
		p.primenum();
	}
}
