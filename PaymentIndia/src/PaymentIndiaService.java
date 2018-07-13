public class PaymentIndiaService {
    public static void main(String args[]){
        Payment payment1 = PaymentFactory.getInstance("CC");
        payment1.pay();
        Payment payment2 = PaymentFactory.getInstance("DC");
        payment2.pay();
    }
}
