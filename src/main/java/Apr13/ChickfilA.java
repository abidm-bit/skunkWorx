package Apr13;

import java.util.HashMap;
import java.util.stream.IntStream;

public class ChickfilA {

    static void gtaTwelve(int wantedLevel){
        for(int i=1;i<=wantedLevel+1;i++){
            for(int e=1;e<i;e++){
                System.out.print("*"); // print stars in the same line
            }
            System.out.println();  // skip to the next line
        }
    }

    static void merryChrysler(int height){

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

        // Print the stump (1 asterisk centered)
        int trunkSpaces = height - 1;
        for (int i = 0; i < trunkSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    static boolean primeDrink(int x){
        int counter =0;
        for(int i=1;i<=x;i++){
            if(x%i==0){counter++;}
        }
        return counter ==2;
    }

    static void amazonQuestion(){
        for(int i=1;i<100;i++){
            if(primeDrink(i)){System.out.println(i+" is a prime number");}
            else System.out.println(i + " is a composite number");
        }
    }

    static void countChars(String input){
        HashMap<Character,Integer> answer = new HashMap<>();
        char[]process = input.toLowerCase().replaceAll(" ","").toCharArray();
        for(char x:process){answer.put(x,answer.getOrDefault(x,0)+1);}
        System.out.println(answer.toString());
    }

    void main(){
        gtaTwelve(6); // army gonna clip my ass

        System.out.println("\n");

        merryChrysler(5); // issa christmas tree

        System.out.println("\n");

        String inp1 = "Teeeeeessst Autoooooooomationn";
        countChars(inp1);

        System.out.println("\n");
        System.out.println(primeDrink(12));
        System.out.println(primeDrink(3));

        System.out.println("\n");
        amazonQuestion();
    }
}
