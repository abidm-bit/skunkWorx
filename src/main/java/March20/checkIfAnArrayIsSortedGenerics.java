package March20;

public class checkIfAnArrayIsSortedGenerics {

    static <T extends Comparable> boolean sortCheck(T[]array){

       for(int i=1;i<array.length;i++){
           if(array[i-1].compareTo(array[i])>0){
               return false;
           }
       }
     return true;
    }



    public static void main(String[] args) {
        Integer[] inp1 = {4,5,6};
        Integer[] inp2 = {3,2,1};
        Character[] inp3 = {'s','z','a'};
        String[] inp4 = {"dorian webster","arthur","francine","buster"};


        System.out.println(sortCheck(inp1)); // true
        System.out.println(sortCheck(inp2)); // false
        System.out.println(sortCheck(inp3)); // false
        System.out.println(sortCheck(inp4)); // false

    }
}
