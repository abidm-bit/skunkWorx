package May6;

import java.util.ArrayList;

class typeCasting{
    void main(){
        // wide casting : converting a small datatype to a larger datatype
        int x = 456; // prints 456
        System.out.println(x);
        double y = x; // prints 456.0;
        System.out.println(y);

        // narrowcasting: converting a larger type to a smaller type
        double fahrenheit1 = 451.00; // prints 451.00
        int book1 = (int)fahrenheit1; // prints 451
        System.out.println(fahrenheit1);
        System.out.println(book1);
        double fahrenheit2 = 451.25; // prints 451.00
        int book2 = (int)fahrenheit2; // prints 451
        System.out.println(fahrenheit2);
        System.out.println(book2);

        byte z = 'a';
        char zz = (char) z;
        System.out.println(z); // value
        System.out.println(zz); // a

        String inp = "abc";
        ArrayList<Byte> outp = new ArrayList<>();
        for(int i =0; i<inp.length();i++){
            outp.add((byte)inp.charAt(i));
        }
        System.out.println(outp);
    }
}