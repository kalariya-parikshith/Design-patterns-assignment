package city;

import cab.Micro;
import cab.Mini;
import cab.Suv;

public class Hyderabad implements City {
    private double miniCost,microCost,suvCost;

    public Hyderabad(){
        miniCost = (new Mini()).getCost("Hyderabad");
        microCost = (new Micro()).getCost("Hyderabad");
        suvCost = (new Suv()).getCost("Hyderabad");
    }

    @Override
    public void getChart() {
        System.out.println("Hyderabad cab chart");
        System.out.println("Mini cab "+miniCost+"rs/km");
        System.out.println("Micro cab "+microCost+"rs/km");
        System.out.println("SUV cab "+suvCost+"rs/km\n");
    }
}
