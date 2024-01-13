//java Program to Convert Decimal to Octal Number
public class DecimalOctal 
{

    public static void main(String[] args)
	{
        int decimal = 78;
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }

    public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
/*
8 | 78
8 | 9 -- 6
8 | 1 -- 1
8 | 0 -- 1
(116)
*/