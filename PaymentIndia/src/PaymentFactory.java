public class PaymentFactory {
    public static Payment getInstance(String paymentType){
        switch (paymentType) {
            case "CC":
                return new CreditCard();
            case "DC":
                return new DebitCard();
            case "NetBanking":
                return new NetBanking();
            case "COD":
                return new CashOnDelivery();
            case "Wallets":
                return new Wallets();
            default:
                System.out.println("Not a valid payment option");
                return null;
        }
    }
}
