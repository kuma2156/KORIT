package ch11_access_modifier;

import java.util.Scanner;

/*
    1. Bank 클래스
        1) 필드
            accountNum(계좌번호, 정수)
            accountHolder(예금주이름, 문자열)
            balance(잔액, 정수)
            pinNumber(비밀번호, 4자리 정수, 0 ~ 9999)
            전부 다 private 적용하세요.

        2) 생성자
            기본 생성자
            계좌번호만 받는 생성자
            계좌번호, 예금주만 받는 생성자
            계좌번호, 예금주, 초기 잔액을 받는 생성자
            계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

        3) 메서드
            setter / getter
            특히, Setter의 경우에는 유효성 검증 로직을 편집하셔야 합니다.
                -> 잔액은 음수가 입력될 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능 -> 실패하면 "불가능한 비밀번호입니다"
            deposit -> 입금 관련 메서드 / call2() 유형
                - 올바른 비밀번호인지 확인할 것 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                - 유효한 금액인지 검증(amount가 0초과여야함) -> 실패하면 "불가능한 입력 금액입니다." 하고 메서드 종료
                - 성공한다면
                    콘솔창에
                    입금 성공! 현재 잔액 : ****원

            withdraw(int amount, int inputPin) -> 출금 관련 메서드 / call2()
                - 올바른 비밀번호인지 확인할 것 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                - 유효한 금액인지 검증(amount가 0초과여야함) -> 실패하면 "불가능한 입력 금액입니다." 하고 메서드 종료
                - 출금한 후의 잔액이 0원 '이상'인지 확인 -> 음수라면 "잔액 부족! 출금이 불가능합니다." 하고 메서드 종료
                - 성공한다면
                    콘솔창에
                    출금 성공! 현재 잔액 : ****원

            showAccountInfo() // call1() 유형
                - 콘솔창에
                    김일 님의 계좌번호는 1234567이며, 현재 잔액은 10000 원입니다.

            BankMain 클래스에 객체를 만들어서 setter / getter를 사용하여 계좌 정보 및 출력을 해보고,
            deposit() / withdraw()를 실행 시켜 입금 성공 및 실패 사례를 확인하고 통과되는지 검증해보세요.

실행 예

계좌 번호 : 123456
계좌 소유자 : 홍길동
현재 잔액 : 100000원                 (십만원)

계좌 번호 : 987654
계좌 소유자 : 신사임당
현재 잔액 : 500000원                 (오십만원)

50000원이 입금되었습니다. 현재 잔액 : 150000원            # account1에 대한 입금(오만원 입금)
잔액이 부족하여 출금할 수 없습니다.                        # account1에서 200000원 출금 시도 실패 사례(이십만원 출금 실패사례)
100000원이 출금되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금 (십만원 출금 성공)

100000원이 출금되었습니다. 현재 잔액 : 400000원           # account2에 대한 출금(십만원 출금)
200000원이 입금되었습니다. 현재 잔액 : 600000원           # account2에 대한 입금(이십만원 입금)

최종 계좌 정보
계좌 소유자 : 홍길동
계좌 번호 : 123456
현재 잔액 : 50000원                 (오만원)

계좌 소유자 : 신사임당
계좌 번호 : 987654
현재 잔액 : 600000원                 (육십만원)
 */
public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    // 기본 생성자
    public Bank() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    // 계좌번호 , 예금주 이름 받는 생성자
    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    // 계좌번호 , 예금주 이름, 초기 잔액 받는 생성자
    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // 계좌번호 , 예금주 이름, 초기 잔액, 비밀번호 받는 생성자
    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0 ){
            System.out.println("잔액이 음수 일 수 없습니다.");
            return;
        }
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999){
            System.out.println("올바르 않는 비밀번호 입력입니다. ");
            return;
        }
        this.pinNumber = pinNumber;
    }

    void deposit(int amount, int inputPin) {
        System.out.println();
        System.out.println("입금하실 금액 : " + amount+ "원");
        if (inputPin != this.pinNumber) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        } else if (amount < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        } else {
            this.balance += amount;
            System.out.println("입금 성공! 현재 잔액 : " + this.balance);
        }
    }
    void withdraw(int amount, int inputPin) {
        System.out.println();
        System.out.println("출금 하실 금액 : " + amount+ "원");
        if (inputPin != this.pinNumber) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        } else if (amount < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        } else if (balance < amount){
            System.out.println("잔액 부족!! 현재 잔액 :" + this.balance + "원");
            return;
        }
        else{
            this.balance -= amount;
            System.out.println("출금 성공! 현재 잔액 : " + this.balance);

        }
    }

    void showAccountInfo(){
        System.out.println();
        System.out.println(accountHolder + " 님의 계좌번호는 " + accountNum + "이며, 현재 잔액은 "+ balance+" 원입니다.");
    }

    void showAccountInfo2(){
        System.out.println();
        System.out.println("소유주 : " + accountHolder);
        System.out.println("계좌번호 : " + accountNum);
        System.out.println("비밀번호 : " + pinNumber);
        System.out.println("현재 잔액 : " + balance + "원");
    }
}
