import java.math.BigDecimal;
public class CurrentRatesDisplay implements Observer,Display{
    private double convUSD,convGBP,convEuro;
    private ObserverOperations xeData;
    String objName;

    public CurrentRatesDisplay(ObserverOperations xeData,String objName){
        this.xeData = xeData;
        this.objName = objName;
        xeData.registerObserver(this);
    }

    public void update(double convUSD,double convGBP,double convEuro){
        this.convEuro = convEuro;
        this.convGBP = convGBP;
        this.convUSD = convUSD;
        display();
    }
    public void display(){
        System.out.println("Latest exchange rates what "+objName+" sees is");
        System.out.println("1 USD = INR "+round(convUSD,2));
        System.out.println("1 GBP = INR "+round(convGBP,2));
        System.out.println("1 Euro = INR "+round(convEuro,2));
    }

    public static double round(double d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
