package March8;

import java.util.ArrayList;
import java.util.List;

public class areThesePricesSorted {


    public static void main(String[] args) {
        ArrayList<String> setOne = new ArrayList<>(List.of("$39.99","$29.89","$37.99","$19.99","$49.95","$25.75"));
        System.out.println(isSorted(setOne));
        System.out.println("\n");

        ArrayList<String> setTwo = new ArrayList<>(List.of("$0.15","$0.75","$1.00","$1.25","$1.50"));
        System.out.println(isSorted(setTwo));
    }


    static String isSorted(ArrayList<String> input){
        ArrayList<Double> process = new ArrayList<>();
        for(String all:input){
            all = all.replaceAll("\\$","");
            process.add(Double.parseDouble(all));
        }
        System.out.println(process + ":");
        for(int i=1;i<process.size();i++){
            if(process.get(i-1).compareTo(process.get(i))>0){return "The prices are not sorted";}
        }
        return "The prices are sorted";
    }




}
