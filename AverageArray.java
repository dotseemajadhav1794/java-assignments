//Java Program to Calculate Average of Numbers Using Arrays
public class AverageArray 
{
    public static void main(String[] args) 
	{
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;
		
        for (double num: numArray) 
		{
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: ", average);
    }
}
/* length of array is 6 
	total sum is 166.14
	166.14/6=27.69
*/