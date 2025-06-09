package May7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class thinkorswim5 {

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
        switch((int) Math.signum(getChange())){
            case (1) -> {return "Δ: " + z + " increase";} // "Green"
            case (-1)-> {return "Δ: " + z + " decrease";} // "Red"
            default -> {return "Δ: " + z + ", No change";}   // "Grey"
        }
    }

    
    // debugging only
    public String toString(){
        return  name + " | " + "The latest price is "+ latestPrice + " | " + " The previous price was " + previousPrice + " | " +  incdcr();
    }

    public thinkorswim5(String name, double latestPrice, double previousPrice){
        setName(name);
       setLatestPrice(BigDecimal.valueOf(latestPrice));
       setPreviousPrice(BigDecimal.valueOf(previousPrice));
       setChange();
//        System.out.println(toString());
        System.out.println(incdcr());
    }


    public static void main(String[] args) {
        new thinkorswim5("Sour Patch Kids",1.50,0.75);
        new thinkorswim5("Arizona",1.00,1.00);
        new thinkorswim5("Palantir",108.45,18.75);
        new thinkorswim5("Au",108.94,45.60);
        new thinkorswim5("Palantir",108.45,113.57);
        new thinkorswim5("Direxion Daily AAPL Bull 2X Shares",21.10,21.19);
    }


}