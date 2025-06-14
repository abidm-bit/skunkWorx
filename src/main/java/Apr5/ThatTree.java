package Apr5;

public class ThatTree {

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
        System.out.println("\n");
        printTree(5);
        System.out.println("\n");
        printTree(7);
    }
}
