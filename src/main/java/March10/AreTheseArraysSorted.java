package March10;

public class AreTheseArraysSorted {


    static boolean isSorted(Integer[] input){
        for(int i=1;i<input.length;i++){
         if(input[i-1]>input[i]){return false;}
        }
        return true;
    }

    static boolean isSorted(Character[] input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){return false;}
        }
        return true;
    }

    static <T extends Comparable> boolean SortCheck(T []input){
        for(int i=1;i<input.length;i++){
            if(input[i-1].compareTo(input[i])>0){return false;}
        }
        return true;
    }



    public static void main(String[] args) {

        Integer[] s1 = {5,94,101,65};
        Integer[] s2 = {4,5,6};
        Character[] s3= {'a','b','c'};
        Character[] s4 = {'b','t','c'};

        System.out.println(SortCheck(s1)); // false
        System.out.println(SortCheck(s3)); // true



//        System.out.println(isSorted(s1));
//        System.out.println(isSorted(s2));
//        System.out.println(isSorted(s3));
//        System.out.println(isSorted(s4));

    }
}
