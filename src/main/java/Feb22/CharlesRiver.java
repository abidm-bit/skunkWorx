package Feb22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class CharlesRiver {



    public static void main(String[] args) {
/*
    Given an array of integers, move all the zeros in the array to the end
    while maintaining the order of the non-zero elements
    Integer [] input = {0,3,5,0,1,8};
    Integer [] output = {3,5,1,8,0,0};

*/

        Integer [] input = {0,3,5,0,1,8};
        ArrayList<Integer> output = new ArrayList<>();
        Arrays.stream(input).filter(e->e!=0).forEach(output::add);
        Arrays.stream(input).filter(e->e==0).forEach(output::addLast);
        System.out.println(output);
        List<Integer> evenSteven = Arrays.stream(input).filter(e->e%2==0).toList();
        System.out.println(evenSteven);


    }
}
