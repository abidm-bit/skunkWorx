package Feb22;

class OnOff {

    /*
   static String evenOrOdd(int x){
       return switch(x%2){
           case(0)-> "Even";
           case(1)-> "Odd";
           case(-1)-> "Odd";
           default -> "placeholder";
       };
   }
    */

    static String evenOrOdd(int x){
         switch(x%2){
            case(0): return "Even";
             case (1), (-1): return "Odd";
             default: return "placeholder";
         }
    }

    public static void main(String[] args) {

        System.out.println(evenOrOdd(22));
        System.out.println(evenOrOdd(-25));
        System.out.println(evenOrOdd(26));

    }


}
