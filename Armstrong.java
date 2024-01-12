//Java Program to Check Armstrong Number
public class Armstrong
{
	public static void main(String[] args)
	{
		 int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

/*
if the number is 3 digit then take cube of each number and it.
the addition should be the same as given number then it is ARMSTRONG number
ex: 371=(3*3*3)+(7*7*7)+(1*1*1)=27+343+1=371
ex:15=1*1+5+5=1+25!=26
ex:1634=(1*1*1*1)+(3*3*3*3)+(6*6*6*6)+(4*4*4*4)=1+1296+81+256=1364
*/