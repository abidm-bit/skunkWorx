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

    static void medianElement (String []input){
        int median = input.length/2;
        if(input.length%2!=0){
            System.out.println(input[median]);
        }
        else{
            System.out.println(input[((median)+(median-1)/2)]);
        }
    }

    void main(){
    wantedLevel(5); // SWAT trux
    System.out.println();
    wantedLevel(6); // raptor & tanx
    System.out.println();
    String[]s1 = {"youtube","stack overflow","chatgpt","colleagues"};
    String[]s2 = {"limitless","taking of pelham 123","deja vu"};

    medianElement(s2);
    medianElement(s1);

    }
}
