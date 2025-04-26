package Apr25;

import java.text.DecimalFormat;



// POST
// GET
// DELETE
class thinkOrSwim2 {

    private double result;

    private void calculator(double latest,double previous){
        result = (((latest-previous)/(previous)*100)); }

    private String incdcr(){
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String z ="= "+formatter.format(result) + " %";
        switch(Math.signum(result)){
            case (1.0) -> {return z + " Increase";} // "Green"
            case (-1.0)-> {return z + " Decrease";} // "Red"
            default -> {return z + " No change";}   // "Grey"
        }
    }

      protected thinkOrSwim2 (double latest,double previous){
        System.out.print("latest price: " + latest + " | previous price: " + previous + " ");
        calculator(latest,previous);
        System.out.println(incdcr());
      }

    public static void main(String[] args) {

    }
}












