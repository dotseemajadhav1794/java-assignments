//Java Program to Calculate Power Using Recursion
public class PowerRecursion 
{
    public static void main(String[] args) 
    { 
		int base = 15, powerRaised = 4;
		int result = power(base, powerRaised);
		System.out.println(base + "^" + powerRaised + "=" + result);
    }
	public static int power(int base, int powerRaised) {
    if (powerRaised != 0) 
	{
      // recursive call to power()
      return (base * power(base, powerRaised - 1));
    }
    else 
	{
      return 1;
    }
  }
}