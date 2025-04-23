package ch06_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        // Condition05 을 생각하면 100초과 / 0 미만의 점수도 입력이 가능합니다
        // 이러한 에러를 수정해야할 필요가 있다.
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String grade= "";

        System.out.print("점수를 입력하세요 : ");
        score = sc.nextInt();

        // 문제 사항을 해결하지 못하는 방식 if 문은 순차적으로 실행되기 때문이다.
//        if(score >= 90){
//            grade = "A";
//        }else if(score >= 80){
//            grade = "B";
//        }else if(score >= 70){
//            grade = "C";
//        }else if(score >= 60){
//            grade = "D";
//        }else if(score > 100){
//            System.out.println("불가능한 점수 입력입니다.");
//        }else if(score < 0){
//            System.out.println("불가능한 점수 입력입니다.");
//        }
//        else{
//            grade = "F";
//        }

        // # 1. 이 방식도 적절하지 않는 방식이다
        if(score > 100){
            System.out.println("불가능한 점수 입력입니다.");
        }else if(score < 0){
            System.out.println("불가능한 점수 입력입니다.");
        }else if(score >= 90){
            grade = "A";
        }else if(score >= 80){
            grade = "B";
        }else if(score >= 70){
            grade = "C";
        }else if(score >= 60){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.println("당신의 점수는 "+ score + "이고, 학점은 "+  grade + "입니다.");
    }
}
