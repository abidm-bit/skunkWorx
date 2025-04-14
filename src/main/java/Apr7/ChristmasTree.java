package Apr7;

import static java.lang.System.out;

public class ChristmasTree {


    // for loop for height (# of lines)
        // nested inside:
        // for loop for leading spaces
        // for loop to print the star
        // for loop for trailing spaces
    // out.println() skip to the next line
    // & print the leading spaces + star + trailing spaces



    static void printTree(int height) {

        for (int i = 1; i <= height; i++) {
            int spaces = height - i;
            int stars = 2 * i - 1; // For a centered triangle

            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int t = spaces; t > 0; t--) {
                System.out.print(" ");
            }

            // Move to the next line
            System.out.println();
        }
    }



    public static void main(String[] args) {
    printTree(3);

    }


}
