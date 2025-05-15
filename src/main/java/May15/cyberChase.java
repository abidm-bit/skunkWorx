package May15;

public class cyberChase {

    static void wantedLevel(int height){
        for(int floor =1;floor<=height;floor++){
            for(int stone = 1;stone<=floor;stone++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    void main(){
    wantedLevel(5); // SWAT trux
    System.out.println();
    wantedLevel(6); // raptor & tanx
    }
}
