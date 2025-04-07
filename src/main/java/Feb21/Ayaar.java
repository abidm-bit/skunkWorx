package Feb21;

class Ayaar {

    static boolean checkIfSorted(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){return false;}
        }
        return true;
    }

    static boolean checkIfSorted(char[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){return false;}
        }
        return true;
    }

    static boolean checkIfSorted(double[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){return false;}
        }
        return true;
    }


    static <T extends Comparable<T>> boolean checkIfSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].compareTo(array[i]) > 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] r1 = {0,3,5,0,1,8};

        char[] r2 = {'m','l','n','x','y'};

        double[] d2 = {16.50,9.50,3.5};

// Generics extends Comparable method applies to objects

        Integer [] a1 = {0,3,5,0,1,8};

        Character [] a2 = {'m','l','n','x','y'};

        Double [] a3 = {16.50,9.50,3.5};


        System.out.println(checkIfSorted(r1));
        System.out.println(checkIfSorted(r2));
        System.out.println(checkIfSorted(d2));

        System.out.println("Generics extends Comparable method:");

        System.out.println(checkIfSorted(a1));
        System.out.println(checkIfSorted(a2));
        System.out.println(checkIfSorted(a3));




    }







}
