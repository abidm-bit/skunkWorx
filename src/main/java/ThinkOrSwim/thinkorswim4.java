package ThinkOrSwim;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class thinkorswim4 {

    private String name;
    private BigDecimal latestPrice;
    private BigDecimal previousPrice;
    private Double change;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public BigDecimal getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(BigDecimal latestPrice) {
        this.latestPrice = latestPrice.setScale(2, RoundingMode.UNNECESSARY);
    }

    public BigDecimal getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(BigDecimal previousPrice) {
        this.previousPrice = previousPrice.setScale(2, RoundingMode.UNNECESSARY);
    }

    public Double getChange() {
        return change;
    }

    private void setChange() {
        BigDecimal changeValue = latestPrice
                .subtract(previousPrice)
                .divide(previousPrice,RoundingMode.CEILING)
                .setScale(2, RoundingMode.UNNECESSARY)
                .multiply(BigDecimal.valueOf(100));
        this.change = changeValue.doubleValue();
    }

    private String incdcr(){
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String z =formatter.format(getChange()) + "%";
        switch(Math.signum(getChange())){
            case (1.0) -> {return z + " increase";} // "Green"
            case (-1.0)-> {return z + " decrease";} // "Red"
            default -> {return z + ", No change";}   // "Grey"
        }
    }

    public String toString(){
        return  name + " | " + "The latest price is "+ latestPrice + " | " + " The previous price was " + previousPrice + " | " + " Δ: " + incdcr();
    }

    public thinkorswim4(String name, BigDecimal latestPrice, BigDecimal previousPrice){
        setName(name);
       setLatestPrice(latestPrice);
       setPreviousPrice(previousPrice);
       setChange();
        System.out.println(toString());
    }


    public static void main(String[] args) {
        new thinkorswim4("Sour Patch Kids",BigDecimal.valueOf(1.50),BigDecimal.valueOf(0.75));
        new thinkorswim4("Arizona",BigDecimal.valueOf(1.00),BigDecimal.valueOf(1.00));
        new thinkorswim4("Palantir",BigDecimal.valueOf(109.45),BigDecimal.valueOf(18.75));
    }


}