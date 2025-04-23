package ch06_condition;

import java.util.Scanner;

/*
    조건문
    1. if 문 : if 다음에 있는 () 내의 조건식이 true 일 경우 {} 내 실행문을 실행
        false 실행 X
        
        형식 : 
        if (조건식){
            실행문
        }
 */
public class Condition01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;

        // 조건문 적용 true 이므로 실행 O
        if(num1 > 0){
            System.out.println("num1은 양수입니다.");
        }

        // false 이므로 실행 X
        if(num1 > 15){
            System.out.println("num1은 15 초과입니다.");
        }

        // Scanner import
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        if(num2 > 0){
            System.out.println("num2는 양수입니다.");
        }
    }
}
