package ch06_condition;

import java.util.Scanner;

/*
    if - else if 문 : else에 조건식을 달 수 있는 형식이다

    형식 : if(조건식){
        실행문
    }else if(조건식2){
        실행문2
    }
    ...
    이런 식으로 여러개 할 수 있다.
 */
public class Condition03 {
    public static void main(String[] args) {
        // Scannner import
        Scanner sc = new Scanner(System.in);

        // 변수 / 상수의 선언 및 초기화
        int point = 0;
        // final 키워드가 붙으면 재대입이 불가능하다 즉, 상수 값 변함없는 값을 원한다면 final 키워드를 사용하자
        final int VIP_POINT = 80;
        final int GOLD_POINT= 60;
        final int SILVER_POINT= 40;
        final int BRONZE_POINT= 20;
        // final 키워드를 사용하는 변수들은 개발자들이 알아보기 쉽게 대문자로 적는다 위의 예시처럼...

        System.out.print("회원 포인트를 입력하세요 : ");
        point = sc.nextInt();
        // 조건문 1.
//        if (point >80){
//            System.out.println("회원 등급 : VIP");
//        }else if(point > 60){
//            System.out.println("회원 등급 : GOLD");
//        }else if(point > 40){
//            System.out.println("회원 등급 : SILVER");
//        }else if(point > 20){
//            System.out.println("회원 등급 : BRONZE");
//        }else{
//            System.out.println("회원 등급 : NORMAL");
//        }

        // 반복되는 부분이 너무 많아 줄이는 버전
        // 등급을 지정하는 변수를 하나 선언
        String userGrade = "";
        if (point >80){
            userGrade = "VIP";
        }else if(point > 60){
            userGrade = "GOLD";
        }else if(point > 40){
            userGrade = "SILVER";
        }else if(point > 20){
            userGrade = "BRONZE";
        }else{
            userGrade = "NORMAL";
        }
        System.out.println("회원 등급 : " + userGrade);
        // 1번과 같이하면 너무 많은 리터럴을 사용하므로 이게 더 효율적인 코딩이다.
        // if - else / if - else if 문의 경우  전체가 한 세트의 조건문으로 봐야 할 필요가 있다.


    }
}
