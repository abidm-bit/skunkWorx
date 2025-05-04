package May2;

import java.text.DecimalFormat;

// POST

class thinkOrSwim2 {

    private double result;

    private void calculator(double latest,double previous){
        result = (((latest-previous)/(previous)*100)); }

    private String incdcr(){
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String z =formatter.format(result) + " %";
        switch(Math.signum(result)){
            case (1.0) -> {return z + " increase";} // "Green"
            case (-1.0)-> {return z + " decrease";} // "Red"
            default -> {return z + " no change";}   // "Grey"
        }
    }
      public thinkOrSwim2 (double latest,double previous){
        System.out.print("latest price: " + latest + " | previous price: " + previous + " | ");
        calculator(latest,previous);
        System.out.println(incdcr());
      }

    public static void main(String[] args) {
new thinkOrSwim2(1.50,0.75);
new thinkOrSwim2(9.00,5.00);
new thinkOrSwim2(1.25,0.75);
new thinkOrSwim2(14.99,69.99);
new thinkOrSwim2(24.99,34.99);
        //
new thinkOrSwim2(0.00,0.00); //
    }
}




// GET
// DELETE







