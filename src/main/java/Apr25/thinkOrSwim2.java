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

class SUBWAYFOOTLONG extends thinkOrSwim2{
    protected SUBWAYFOOTLONG(double latest, double previous){
        super(latest, previous);
    }
}

class MACBOOKAIR extends thinkOrSwim2{
    protected MACBOOKAIR(double latest, double previous){
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
        new SPY(548.36,489.24); // las vegas
        new VICKS(28.34,35.89); // market bpd
        new NINTENDO(59.99,59.99); // 8 year old nintendo games
        new SUBWAYFOOTLONG(10.56,5.39); // inflation
        new MACBOOKAIR(999.99,1799.99); // apple is for the consumer

    }
}












