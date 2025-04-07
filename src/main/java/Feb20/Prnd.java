package Feb20;

class Prnd {

    static void revStringM1(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    static String revStringM2(String s){
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        revStringM1("radaR");
        System.out.println("\n");
        System.out.println(revStringM2("Wow"));

    }
}
