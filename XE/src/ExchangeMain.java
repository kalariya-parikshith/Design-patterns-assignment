public class ExchangeMain {
    public static void main(String args[]){
        XeData xeData = new XeData();
        CurrentRatesDisplay obs1 = new CurrentRatesDisplay(xeData,"Observer 1");
        CurrentRatesDisplay obs2 = new CurrentRatesDisplay(xeData,"Observer 2");
        xeData.setConversions(68,81,72);
        xeData.removeObserver(obs1);
        xeData.setConversions(65,78,68);
    }
}
