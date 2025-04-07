package Feb21;

class CubeYear {

    // 1^3 + 2^3 + ... + 9^3 = 2025


    public static void main(String[] args) {

        double sum =0.0;
        for(int i=1;i<=9;i++){
            sum+= Math.pow((double) i,3);
        }
        System.out.println((int)sum);
    }



}
