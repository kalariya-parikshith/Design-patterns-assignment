public class Salad extends DecoratorSub {
    public Salad(Sub sub) {
        super(sub);
        System.out.println("Adding Salad");
    }
    @Override
    public String getDescription() {
        return sub.getDescription()+" Salad";
    }

    @Override
    public double getCost() {
        return sub.getCost()+10.0;
    }

}
