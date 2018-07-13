import city.City;

public class Passenger {
    public static void main(String args[]){
        OttoAbstractFactory cityFactory = FactoryProducer.getFactory();
        City city = cityFactory.getCity("Hyderabad");
        city.getChart();
        City city1 = cityFactory.getCity("Bengaluru");
        city1.getChart();
        City city2 = cityFactory.getCity("Chennai");
        city2.getChart();
    }
}
