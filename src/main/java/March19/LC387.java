package March19;

import java.util.*;

public class LC387 {
/*
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.

Input: s = "leetcode" \\ Output: 0
The character 'l' at index 0 is the first character that does not occur at any other index.

Input: s = "loveleetcode" \\ Output: 2

Input: s = "aabb" \\ Output: -1
*/



    static int firstUniqChar(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1 in the original order
        for (int i = 0; i < s.length(); i++) {
            if (counter.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("leetcode"));

    }
}
