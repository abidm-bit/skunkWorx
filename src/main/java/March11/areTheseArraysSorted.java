package March11;

import java.util.Arrays;

public class areTheseArraysSorted {

    // for primitive data types I'll have to rewrite the method and overload the parameter

    static boolean method1(int[]input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
            // if the first element is greater than the second, the array isn't sorted, return false
        }
        return true;
        // if the preceding element is not greater than the next, the array is sorted, return true
    }

    static boolean method1(char[]input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
            // if the first element is greater than the second, the array isn't sorted, return false
        }
        return true;
        // if the preceding element is not greater than the next, the array is sorted, return true
    }

    static boolean method1(double []input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
            // if the first element is greater than the second, the array isn't sorted, return false
        }
        return true;
        // if the preceding element is not greater than the next, the array is sorted, return true
    }


    static <T extends Comparable> boolean method2(T []input ){
        for(int i=1;i<input.length;i++){
            if(input[i-1].compareTo(input[i])>0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // Primitive testData
        int[] r1 = {0,3,5,0,1,8};
        char[] r2 = {'m','l','n','x','y'};
        double[] d2 = {16.50,9.50,3.5};
        System.out.println("These 3 sets will print false:");
        System.out.println(method1(r1));
        System.out.println(method1(r2));
        System.out.println(method1(d2));
        System.out.println("Until I use arrays.sort()");
        Arrays.sort(r1); Arrays.sort(r2);Arrays.sort(d2);
        System.out.println("Now these 3 sets are sorted:");
        System.out.println(method1(r1));
        System.out.println(method1(r2));
        System.out.println(method1(d2));

        System.out.println("I used a single method and overloaded the parameter for the 3 primitive dataTypes");
        System.out.println("\n");
        System.out.println("For Wrapper/object dataTypes");

        // Wrapper/ Object testData
        Integer [] s1 = {0,3,5,0,1,8};
        Character [] s2 = {'m','l','n','x','y'};
        Double [] s3 = {16.50,9.50,3.5};

        System.out.println(method2(s1));
        System.out.println(method2(s2));
        System.out.println(method2(s3));



    }
}
