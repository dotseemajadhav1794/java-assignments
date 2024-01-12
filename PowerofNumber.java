//Java Program to Calculate Power of a Number
public class PowerofNumber
{
	public static void main(String[] args)
	{
		int base = 5;  
        int exponent = 4;  
        int result = 1;  
        for (int i = 0; i < exponent; i++) {  
            result *= base;  
        }  
        System.out.println(base + " to the power of " + exponent + " is = " + result);  
	}
}
  /*while (exponent > 0) {  
            result *= base;  
            exponent--;  
        }  */