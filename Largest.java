//Java Program to Find Largest Number Among Three Numbers
		public class Largest {

    public static void main(String[] args) {

		int x=4,y=9,z=1;

        if( x >= y && x >= z)
            System.out.println(x + " is the largest number.");

        else if (y >= x && y >= z)
            System.out.println(y + " is the largest number.");

        else
            System.out.println(z + " is the largest number.");
    }
}