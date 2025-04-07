package Feb20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Sum {

    static int sumM1(int a, int b){
        return a+b;
    }
    static int sumM1(int a, int b, int c){
        return a+b+c;
    }

    static int sumM2(int[]input){
        int sum = 0;
        for(int a:input){
            sum+=a;
        }
        return sum;
    }

    static int sumM2(List<Integer>input){
        int sum = 0;
        for(int a:input){sum+=a;}
        return sum;
    }

    static int sumM3(int[]input){
        return IntStream.of(input).sum();
    }




    public static void main(String[] args) {
        System.out.println(sumM1(1,2));         // 3
        System.out.println(sumM1(4,5,6));    // 15
        int [] s1 = {6,1,9};
        ArrayList<Integer> s3 = new ArrayList<>(List.of(3,2,1));
        System.out.println(sumM2(s1));                // 16
        System.out.println(sumM2(s3));                // 6
        int [] s2 = {2,0,2,5};
        System.out.println(sumM3(s2));                // 9



    }



}
