package May15;

/*
LC28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
*/

import java.util.stream.Stream;

public class LC28 {

    static int leetcode28(String haystack,String needle){
        if(haystack.contains(needle)){return haystack.indexOf(needle);}
        else return -1;
    }

    void main(){

        String x = "sadbutsad", y = "sad";

        String a = "leetcode", b = "leeto";

        System.out.println(leetcode28(x,y));
        System.out.println();
        System.out.println(leetcode28(a,b));


    }


}
