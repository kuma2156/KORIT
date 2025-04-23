package ch06_condition;
/*
    if - else 문 : if 다음에 조건식이 false 일 경우 else 문에 있는 실행문 실행

    형식: if(조건식){
        실행문
    } else {
         실행문2
    }
 */

public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1 > 0){
            System.out.println("num1은 양수입니다.");
        }else {
            System.out.println("num1은 0이거나 음수입니다.");
        }
    }
}
