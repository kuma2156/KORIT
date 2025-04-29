package ch15_casting.payment;

public class CardPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("카드로 "+ amount + "원 결제되었습니다.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("카드로 "+ amount + "원 환불되었습니다.");
    }
}
