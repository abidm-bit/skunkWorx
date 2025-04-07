package March23;

public class LC2085 {

    /*
    Given two string arrays words1 and words2,
    return the number of strings that appear exactly
    once in each of the two arrays.

    Input:
    String [] words1 = {"leetcode","is","amazing","as","is"};
    String [] words2 = {"amazing","leetcode","is"};
    Output: 2 ["amazing","leetcode"]

     String [] words3= {"b","bb","bbb"};
     String [] words4 = {"a","aa","aaa"};

    String [] words5= {"a","ab"};
    String [] words6= {"a","a","a","ab"};

    */



    static int countWords(String[] words1, String[] words2) {
   return 1;

    }



    public static void main(String[] args) {
        String [] words1 = {"leetcode","is","amazing","as","is"};
        String [] words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1,words2));

        String [] words3= {"b","bb","bbb"};
        String [] words4 = {"a","aa","aaa"};
        System.out.println(countWords(words3,words4));

        String [] words5= {"a","ab"};
        String [] words6= {"a","a","a","ab"};
        System.out.println(countWords(words5,words6));


    }
}
