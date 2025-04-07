package March20;

import java.util.Arrays;

class findWordsStartingWith {

    static String[] findWordsWithCharacter(String input){
        String [] words = input.split(" ");
        return Arrays.stream(words).filter(e->e.startsWith("b")).toArray(String[]::new);
    }


    public static void main(String[] args) {

        String process = "apple banana mango box bean fox auto bike";
        System.out.println(Arrays.toString(findWordsWithCharacter(process)));

    }
}
