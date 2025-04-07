package Feb20;

class StringUnion {


    static String unionM1(String a, String b){
        return a+ " " + b;
    }

    static String unionM2(String a, String b){
        return a.concat(" "+ b);
    }

    static String unionM3(String[]input){
        StringBuilder sb = new StringBuilder();
        for(String a:input){
            sb.append(a).append(" ");
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(unionM1("Eur","up"));
        System.out.println(unionM2("post","man"));
        String[]set = {"Mr","narcissist","I","don't","negotiate","with","therapists"};
        System.out.println(unionM3(set));

    }



}
