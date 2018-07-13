import java.util.ArrayList;
import java.util.List;

public class XeData implements ObserverOperations{
    //converted values to indian rupees
    private double convUSD,convGBP,convEuro;

    private List<Observer> observers;

    public XeData(){observers = new ArrayList<>();}


    public void setConversions(double convUSD,double convGBP,double convEuro){
        this.convEuro = convEuro;
        this.convGBP = convGBP;
        this.convUSD = convUSD;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers)
            o.update(convUSD,convGBP,convEuro);
    }
}
