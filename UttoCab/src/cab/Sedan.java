package cab;

public class Sedan implements Cab {
    private double hydCab;
    private double bengaluruCab;
    private double chennaiCab;

    public Sedan(){
        hydCab = 10;
        bengaluruCab = 11;
        chennaiCab = 11;
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
