package Feb20;

class POC {
    /*
            A prime number has 2 factors: 1 and the number itself
            if a number has more than 2 factors, it's a composite number
    */

    static String primeorcomposite(int x){
        int counter =0;
        for(int i=1;i<=x;i++){
            if(x%i==0){counter++;}
        }
        if(counter==2){return "Prime";}
        else return "Composite";
    }




    public static void main(String[] args) {
        System.out.println(primeorcomposite(5));
        System.out.println(primeorcomposite(28));
    }



}
