package March7;

public class CheckIfThisArrayIsSorted {

    // I'm passing an int array here
    // for other datatypes, I'd have to create the same method
    // & pass the data type in the parameter, method overloading

    static boolean isThisArraySorted(int[]input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
        }
        return true;
    }
    static boolean isThisArraySorted(char[]input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
        }
        return true;
    }

    static boolean isThisArraySorted(double[]input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
        }
        return true;
    }

    // To create a single method that will accept abstract DataTypes in the parameter
    // I'll use <Generics extends Comparable> , I can't pass primitive datatypes
    // also I can't use arr[i-1] > arr[i] , I'll have to use .compareTo

    static <T extends Comparable<T>> boolean isThisArraySortedM1(T[]input){
        for(int i=1;i<input.length;i++){
            if(input[i-1].compareTo(input[i])>0){return false;} // compares the order, if (a > b)
        }return true;
    }





    public static void main(String[] args) {

        int[] r1 = {0,3,5,0,1,8};
        char[] r2 = {'m','l','n','x','y'};
        double[] r3 = {16.50,9.50,3.5};

        System.out.println(isThisArraySorted(r1));
        System.out.println(isThisArraySorted(r2));
        System.out.println(isThisArraySorted(r3));


        System.out.println("using the Generics extends Comparable method:");

        Integer [] r4 = {0,3,5,0,1,8};
        Character [] r5 = {'m','l','n','x','y'};
        Double [] r6 = {16.50,9.50,3.5};

        System.out.println(isThisArraySortedM1(r4));
        System.out.println(isThisArraySortedM1(r5));
        System.out.println(isThisArraySortedM1(r6));


    }
}
