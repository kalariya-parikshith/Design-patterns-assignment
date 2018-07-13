public class Sauce extends DecoratorSub {
    public Sauce(Sub sub) {
        super(sub);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return sub.getDescription()+" Sauce";
    }

    @Override
    public double getCost() {
        return sub.getCost()+5.0;
    }
}
