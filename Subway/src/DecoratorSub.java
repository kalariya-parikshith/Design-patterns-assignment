public abstract class DecoratorSub implements Sub{
    protected Sub sub;
    public DecoratorSub(Sub sub){
        this.sub = sub;
    }

    @Override
    public String getDescription() {
        return sub.getDescription();
    }

    @Override
    public double getCost() {
        return sub.getCost();
    }
}
