package Apr5;

public class Starr {
     void main() {

        for(int i=1;i<=5;i++){
           for(int e=1;e<=i;e++){
               System.out.print("*");
           }
           System.out.println();
        }

         System.out.println("\n");

         for(int i=5;i>=1;i--){
             for(int e=5;e>=i;e--){
                 System.out.print(" ");
                 System.out.print("*");
                 System.out.print(" ");
             }
             System.out.println();
         }

         System.out.println("\n");

         for(int i=5;i>=1;i--){
            for(int e=1;e<=i;e++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}

