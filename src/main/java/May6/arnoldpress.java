package May6;

class arnoldpress{

    static boolean armstrongCheck(int number){
        String x = String.valueOf(number);
        String[] y = x.split("");
        double sum=0.0;
        for(String all:y){
            sum+=Math.pow(Double.parseDouble(all),y.length);
        }
        return Double.parseDouble(x) == sum;
    }

    void main(){
        System.out.println(armstrongCheck(153));
        System.out.println(armstrongCheck(1634));
    }
}

