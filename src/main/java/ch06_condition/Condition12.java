package ch06_condition;

import java.util.Scanner;

/*
    Condition07 파일을 확인하면
    점수를 입력해서 등급을 산출했습니다
    이를 응용하여 중청 if 문 + switch 문 형태로 프로그램을 작성합니다

    지시사항
    사용자에게 점수를 입력받아 다음과 같은 조건을 만족시키도록 작성하세요
    score가 0미만 이거나 100 초과이면 grade = x

    changedScore = 9 ~ 10 , grade = A
    changedScore = 8 , grade = B
    changedScore = 7 , grade = C
    changedScore = 6 , grade = D
    changedScore = 5 ~ 1 , grade = F

    실행 예
    점수를 입력하세요 :  100
    점수는 100점이고 , 학점은 A 학점입니다
    changedScore = score/ 10

 */
public class Condition12 {
    public static void main(String[] args) {
        int score = 0;

        String grade = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        score = scanner.nextInt();

        int changedScore = score / 10;
        switch (changedScore) {
            case 10 :
//                grade = "A";
//                break;
            case 9 :
                grade = "A";
                break;
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            case 6 :
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        if (!(score > 100 || score < 0)){
            System.out.println("점수는 "+ score + "이고, 학점은 "+ grade+"입니다");
        }else{
            System.out.println("불가능한 점수입니다");
        }

    }
}
