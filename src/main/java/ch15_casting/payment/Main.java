package ch15_casting.payment;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.proccessPayment(new CardPayment(),1000);
        paymentService.proccessPayment(new KakaoPayment(),2500);
        paymentService.proccessPayment(new TossPayment(),7000);

        paymentService.refundPayment(new TossPayment(), 5000);
    }
}
