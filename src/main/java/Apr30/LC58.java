package Apr30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LC58 {

    static int lengthOfLastWordm1(String s) {
        String[] s1= s.split(" ");
        return (s1[s1.length-1].length());
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWordm1("Hello World"));                  // 5
        System.out.println(lengthOfLastWordm1("   fly me   to   the moon  "));  // 4
        System.out.println(lengthOfLastWordm1("luffy is still joyboy"));        // 6
    }
}
