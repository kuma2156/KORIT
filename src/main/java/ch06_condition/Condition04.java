package ch06_condition;
/*
    if - else if 문 : else에 조건식을 달 수 있는 형식이다

    형식 : if(조건식){
        실행문
    }else if(조건식2){
        실행문2
    }else {
        실행문3
    }
    마지막을 else 이렇게 해줘도 된다
    
 */
import java.util.Scanner;

public class Condition04 {
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

        String userGrade = "";
        if (point >VIP_POINT){
            userGrade = "VIP";
        }else if(point > GOLD_POINT){
            userGrade = "GOLD";
        }else if(point > SILVER_POINT){
            userGrade = "SILVER";
        }else if(point > BRONZE_POINT){
            userGrade = "BRONZE";
        }else{
            userGrade = "NORMAL";
        }

        System.out.println("회원 등급 : " + userGrade);

    }
}
