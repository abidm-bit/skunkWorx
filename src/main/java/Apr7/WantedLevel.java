package Apr7;

import static java.lang.System.out;

public class WantedLevel {
    public static void main(String[] args) {

        for(int i=1;i<=7;i++){
            for(int e=1;e<i;e++){
                out.print('*');
            }
            out.println();
        }

    }
}
