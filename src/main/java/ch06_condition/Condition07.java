package ch06_condition;

import java.util.Scanner;

/*
    중첩 if문 (nested - if)
        if 문 내에 if 문이 연속적으로 작성될 수 있습니다.

        형식:
        if(조건식1) {
            실행문1
        } else if(조건식1b) {
            실행문1b
        } else if(조건식1c) {
            실행문1c
        } else {
            실행문1d
        }
        else if (조건식2) {
            실행문2
            if (조건식2b){
                실행문2b
            }...
        }

        이런 식으로 조건문을 중첩해서 쓸수도 있다.

 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score ;
        String grade;
        System.out.print("점수를 입력하세요 : ");
        score = sc.nextInt();

        if(score > 100 || score <0 ){
            System.out.println("불가능한 점수입니다.");
            grade = "X";
        }else {
            // 0 보단 크고 100보단 작은 수는 이 중괄호 즉 else 문안에 들어간다.
            if(score >= 90){
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

        }
        System.out.println("당신의 점수는 "+ score + "이고, 학점은 "+  grade + "입니다.");

    }
}
