public class DebitCard implements Payment {
    @Override
    public void pay(){
        System.out.println("Paid via debit card");
    }
}
