package Feb20;

class SimpleSwap {

    static void swapM1(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("post swap");
        System.out.println("a: " + a + " b: " + b);
    }
    static void swapM1(String a, String b) {
        System.out.println("a: " + a + " b: " + b);
        String c;
        c=b;
        b=a;
        a=c;
        System.out.println("post swap");
        System.out.println("a: " + a + " b: " + b);
    }

    static void swapM2(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("post swap");
        System.out.println("a: " + a + " b: " + b);
    }

    static void swapM2(String a, String b) {
        System.out.println("a: " + a + " b: " + b);
        a=a.concat(b); // combine the two strings
        b=a.replaceAll(b,""); //remove b, left with a
        a=a.replaceAll(b,""); // remove b
        System.out.println("post swap");
        System.out.println("a: " + a + " b: " + b);

    }

    public static void main(String[] args) {
        swapM1(10,20);
        swapM2(31,45);
        swapM1("ode","pee");
        swapM2("bbq","dallas");
    }

}
