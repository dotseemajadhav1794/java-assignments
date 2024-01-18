//Write a program to calculate HCF of Two given number.
public class HCFNum
{
  public static void main (String[]args)
  {
    int num1 = 36, num2 = 60, hcf=0;

    for (int i = 1; i <= num1 || i <= num2; i++)
      {
     if (num1 % i == 0 && num2 % i == 0)
        hcf = i;
      }

    System.out.println("The HCF: "+ hcf);
  }
}
/*
	class HCFNum
{
  public static void main (String[]args)
  {
    int num1 = 36, num2 = 60, hcf;

    while (num1 != num2)
    {
        if (num1 > num2)
            num1 -= num2;
        else
            num2 -= num1;
    }

*/


/*
output
The HCF: 12
*/