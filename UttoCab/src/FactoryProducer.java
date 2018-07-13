public class FactoryProducer {
    public static OttoAbstractFactory getFactory(){
            return new CityFactory();
    }
}
