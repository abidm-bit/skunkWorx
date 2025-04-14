package Apr8;

public class cubeYear {
    static double sum =0.0;
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            sum+= Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
