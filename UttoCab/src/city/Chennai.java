package city;

import cab.Micro;
import cab.Mini;
import cab.Sedan;

public class Chennai implements City {
    private double miniCost,microCost,sedanCost;

    public Chennai(){
        miniCost = (new Mini()).getCost("Chennai");
        microCost = (new Micro()).getCost("Chennai");
        sedanCost = (new Sedan()).getCost("Chennai");
    }

    @Override
    public void getChart() {
        System.out.println("Chennai cab chart");
        System.out.println("Mini cab "+miniCost+"rs/km");
        System.out.println("Micro cab "+microCost+"rs/km");
        System.out.println("Sedan cab "+sedanCost+"rs/km\n");
    }
}
