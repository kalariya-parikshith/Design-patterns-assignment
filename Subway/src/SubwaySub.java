public class SubwaySub {
    public static void main(String a[]){
        Sub firstSub = new Sauce(new Salad(new Bread()));
        System.out.println("Subway sub ingredients: "+firstSub.getDescription());
        System.out.println("Cost of sub "+firstSub.getCost());
    }
}
