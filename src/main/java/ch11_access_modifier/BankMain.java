package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bankUser1 = new Bank();

        bankUser1.setAccountHolder("김명규");
        bankUser1.setAccountNum(500);
        bankUser1.setBalance(500000);
        bankUser1.setPinNumber(1111);

        bankUser1.showAccountInfo();
        bankUser1.showAccountInfo2();

        System.out.println();

        System.out.println("비밀번호 일치 O 입금");
        bankUser1.deposit(10000,1111);

        System.out.println("비밀번호 일치 O 출금");
        bankUser1.withdraw(34000,1111);

        System.out.println("비밀번호 일치 X 입금");
        bankUser1.deposit(10000,1112);

        System.out.println("비밀번호 일치 X 출금");
        bankUser1.withdraw(34000,1112);

        // 입금 금액이 음수 일 경우
        bankUser1.deposit(-1000,1111);
        // 출금 금액이 음수 일 경우
        bankUser1.withdraw(-10000,1111);

        bankUser1.showAccountInfo2();

        // 출금시 잔액이 부족할 경우
        bankUser1.withdraw(9999999,1111);

        Bank bankUser2 = new Bank(501,"조은별",9000,2222);

        bankUser2.showAccountInfo2();

//        bankUser1.setBalance(-1000);
    }
}
