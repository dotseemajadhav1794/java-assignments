//Q 18(iv)

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
/*
output
        *
      * *
    * * *
  * * * *
* * * * *
*/
