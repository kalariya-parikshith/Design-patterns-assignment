public class CashOnDelivery implements Payment {
    @Override
    public void pay(){
        System.out.println("Paid via COD");
    }
}
