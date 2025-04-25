package Apr25;

import java.text.DecimalFormat;

class SPY extends thinkOrSwim2{
    protected SPY(double latest, double previous) {
        super(latest, previous);
    }
}
class VICKS extends thinkOrSwim2{
    protected VICKS(double latest, double previous){
        super(latest, previous);
    }
}

class NINTENDO extends thinkOrSwim2{
    protected NINTENDO(double latest, double previous){
        super(latest, previous);
    }
}

class thinkOrSwim2 {

    private double result;

    private void calculator(double latest,double previous){
        result = (((latest-previous)/(previous)*100)); }

    private String icdc(){
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
        System.out.println(icdc());
      }

    public static void main(String[] args) {
        new SPY(548.36,489.24);
        new VICKS(28.34,35.89);
        new NINTENDO(59.99,59.99);
    }
}












