package ch06_condition;
/*
    사용자에게 점수를 입력받아 다음과 같은 조건으로 만족시키도록 작성하세요
    score 이 90점 이상이면 grade A
    score 이 80점 이상이면 grade B
    score 이 70점 이상이면 grade C
    score 이 60점 이상이면 grade D
    score 이 59점 이하이면 grade F

    실행 예 :
    점수를 입력하세요 : 68
    당신의 점수는 68점이고, 학점은 B 입니다.

 */
import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String grade= "";

        System.out.print("점수를 입력하세요 : ");
        score = sc.nextInt();

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

        System.out.println("당신의 점수는 "+ score + "이고, 학점은 "+  grade + "입니다.");
    }
}
