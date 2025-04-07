package Apr5;

import static java.lang.System.out;
//out.println("*");

public class Starr {
     void main() {

        for(int i=1;i<=5;i++){
           for(int e=1;e<=i;e++){
               out.print("*");
           }
           out.println();
        }

         out.println("\n");

         for(int i=5;i>=1;i--){
             for(int e=5;e>=i;e--){
                 out.print(" ");
                 out.print("*");
                 out.print(" ");
             }
             out.println();
         }

         out.println("\n");

         for(int i=5;i>=1;i--){
            for(int e=1;e<=i;e++){
                out.print("*");
            }
            out.println();
         }




}

}

