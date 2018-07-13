package cab;

public class Suv implements Cab {
    private double hydCab;
    private double bengaluruCab;
    private double chennaiCab;

    public Suv(){
        hydCab = 10;
        bengaluruCab = 11;
        chennaiCab = 12;
    }

    @Override
    public double getCost(String location) {
        switch (location) {
            case "Hyderabad":
                return hydCab;
            case "Bengaluru":
                return bengaluruCab;
            default:
                return chennaiCab;
        }
    }
}
