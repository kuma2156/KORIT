package ch15_casting.payment;

public class TossPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("토스결제로 " + amount + "원 결제되었습니다.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("토스결제로 " + amount + "원 환불되었습니다.");
    }
}
