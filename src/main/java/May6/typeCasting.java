package May6;

import java.util.ArrayList;

import static java.io.IO.println;

class typeCasting{
void main(){

    // wide casting : converting a small datatype to a larger datatype
    int x = 456; // prints 456
    println(x);
    double y = x; // prints 456.0;
    println(y);


    // narrowcasting: converting a larger type to a smaller type
    double fahrenheit1 = 451.00; // prints 451.00
    int book1 = (int)fahrenheit1; // prints 451
    println(fahrenheit1);
    println(book1);
    double fahrenheit2 = 451.25; // prints 451.00
    int book2 = (int)fahrenheit2; // prints 451
    println(fahrenheit2);
    println(book2);



    byte z = 'a';
    char zz = (char) z;
    println(z); // value
    println(zz); // a

    String inp = "abc";
    ArrayList<Byte> outp = new ArrayList<>();
    for(int i =0; i<inp.length();i++){
        outp.add((byte)inp.charAt(i));
    }
    println(outp);



}
}