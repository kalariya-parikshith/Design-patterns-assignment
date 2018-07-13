import city.*;

public class CityFactory extends OttoAbstractFactory {

    @Override
    public City getCity(String cityName){
        if(cityName.equalsIgnoreCase("Hyderabad")) {
            return new Hyderabad();
        }
        else if(cityName.equalsIgnoreCase("Bengaluru"))
            return new Bengaluru();
        else if(cityName.equalsIgnoreCase("Chennai"))
            return new Chennai();
        else return null;
    }

}
