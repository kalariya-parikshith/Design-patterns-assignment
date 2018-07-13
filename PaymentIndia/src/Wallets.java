public class Wallets implements Payment {
    @Override
    public void pay(){
        System.out.println("Paid via wallet");
    }
}
