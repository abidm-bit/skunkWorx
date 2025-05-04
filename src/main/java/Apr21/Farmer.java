package Apr21;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Farmer {

    public static void main(String[]args){

        ArrayList<String> garden = new ArrayList<>
                (List.of("Spinach","Cilantro",
                        "Tomato","Cucumbers",
                        "Potatoes","Strawberries"));
        ListIterator<String> plantz = garden.listIterator();

        while(plantz.hasNext()){
            if(plantz.next().contains("i")){
                System.out.println(plantz.previous());
            }
            plantz.next();
        }


    }
}

