//Java Program to Find LCM
public class LCM
{
	public static void main(String[] args)
	{
		int a=12,b=16;
		int i,gcd=1;
		for(i=1;i<=a&&i<=16;i++)
		{
			if(a%i ==0 && b%i ==0)
			gcd=i;
		}
		int lcm = ((a*b)/gcd);
		System.out.println("LCM of given number = "+lcm);
	}
}