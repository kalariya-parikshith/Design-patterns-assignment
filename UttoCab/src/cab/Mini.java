package cab;

public class Mini implements Cab {
    private double hydCab;
    private double bengaluruCab;
    private double chennaiCab;

    public Mini(){
        hydCab = 5;
        bengaluruCab = 7;
        chennaiCab = 6;
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
