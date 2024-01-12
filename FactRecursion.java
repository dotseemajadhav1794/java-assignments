//Java program to Calculate Factorial of a Number Using Recursion
public class FactRecursion {

    public static void main(String[] args) {
        int num = 6;
        long FactRecursion = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + FactRecursion);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}