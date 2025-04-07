package Feb23;

class Ternary {

    static void process1 (String x){
        if((x.length()==4)){
            System.out.println("This has 4 chars");}
        else System.out.println("This doesn't have 4 chars");
    }
    static String process2(String x){
       return (x.length()==4) ? "This has 4 chars":"doesn't have 4 chars";
    }

    public static void main(String[] args) {

        process1("phone");
        System.out.println(process2("cars"));
    }







}
