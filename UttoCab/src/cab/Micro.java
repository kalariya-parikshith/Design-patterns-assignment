package cab;

public class Micro implements Cab {
    private double hydCab;
    private double bengaluruCab;
    private double chennaiCab;

    public Micro(){
        hydCab = 7;
        bengaluruCab = 8;
        chennaiCab = 7;
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
