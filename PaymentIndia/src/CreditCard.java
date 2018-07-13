public class CreditCard implements Payment {
    @Override
    public void pay(){
        System.out.println("Paid via credit card");
    }
}
