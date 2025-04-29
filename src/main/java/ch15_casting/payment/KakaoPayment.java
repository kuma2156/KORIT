package ch15_casting.payment;

public class KakaoPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("카카오 페이로 " + amount + "원 결제되었습니다.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("카카오 페이로 " + amount + "원 환불되었습니다.");
    }
}
