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

static int sumDigits(int x){
        int sum =0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
}

static

    void main(){
    wantedLevel(5); // SWAT trux
    System.out.println();
    wantedLevel(6); // raptor & tanx
    System.out.println();

        System.out.println(sumDigits(456));

    }
}
