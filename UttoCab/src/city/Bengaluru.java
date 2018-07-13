package city;

import cab.Micro;
import cab.Mini;
import cab.Sedan;
import cab.Suv;

public class Bengaluru implements City {
    private double miniCost,microCost,suvCost,sedanCost;

    public Bengaluru(){
        miniCost = (new Mini()).getCost("Bengaluru");
        microCost = (new Micro()).getCost("Bengaluru");
        suvCost = (new Suv()).getCost("Bengaluru");
        sedanCost = (new Sedan()).getCost("Bengaluru");
    }

    @Override
    public void getChart() {
        System.out.println("Bengaluru cab chart");
        System.out.println("Mini cab "+miniCost+"rs/km");
        System.out.println("Micro cab "+microCost+"rs/km");
        System.out.println("SUV cab "+suvCost+"rs/km");
        System.out.println("Sedan cab "+sedanCost+"rs/km\n");
    }
}
