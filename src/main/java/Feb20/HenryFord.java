package Feb20;

class HenryFord {
    /*
        The factorial of a number is the product of the positive numbers preceding that number
        5! = 5 x 4 x 3 x 2 x 1
        3! = 3 x 2 x 1

    */

    // time O(n) , space O(1)
    static int m1(int x){
    int product =1;
    for(int i=x;i>0;i--){
        product *=i;
    }
    return product;
    }

    // time O(n) , space O(n)
    static int m2(int x){
            if(x<0) return 0;
            else if(x==1 || x==0) return 1;
            else return (x)*m2(x-1);
    }


    public static void main(String[] args) {

        System.out.println(m1(5)); // 120
        System.out.println(m1(6)); // 720
        System.out.println(m1(3)); // 6
        System.out.println(m1(1)); // 1
        System.out.println(m1(0)); // 1

        System.out.println("RECURSIVE:");

        System.out.println(m2(5));
        System.out.println(m2(0));
        System.out.println(m2(-2));

    }

}


