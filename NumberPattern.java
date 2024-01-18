//Q 18 (i) Write a programe for number pattern


public class NumberPattern 
{
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Inner loop for printing decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Inner loop for printing increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

/*
output
        1
      212
    32123
  4321234
543212345
*/