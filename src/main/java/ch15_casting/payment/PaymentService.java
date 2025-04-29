package ch15_casting.payment;

public class PaymentService {
    public void proccessPayment(Payment payment, int amount){
        payment.pay(amount);
    }
    public void refundPayment(Payment payment, int amount){
        payment.refund(amount);
    }
}
