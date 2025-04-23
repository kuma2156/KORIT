package ch06_condition;

/*
    삼항 연산자
        정의 : 조건식을 평가하여 true / false 에 따라 두 가지 표현식 중 하나를 선택적으로 실행
        형식 :
        조건식 ? 표현식1 : 표현식2;
        [위치를 기반해서 사용한다]

        조건식: true / false 로 평가 가능한 식
        표현식1 : 조건식이 true 일 경우 실행되는 식
        표현식2 : 조건식이 false 일 경우 실행되는 식


 */
import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max;
        // a > b라면 max에 a를 대입 / 아니라면 max에 b를 대입
        max = (a > b) ? a : b;

        System.out.println(max);

        // 이상의 삼항연산자를 if - else 문으로 풀어쓴다면
        if(a > b){
            max = a;
        }else {
            max = b;
        }
        System.out.println(max);

        // 이상의 삼항연산자 개념을 윤년에 응용해보자
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();
//        boolean isLeapYear = ((year % 4 == 0 && year % 100 == 0 ) || year % 400 ==0);
//        String result = isLeapYear ? "윤년입니다" : "윤년이 아닙니다";
//        // boolean 자료형 변수명은 is 로 시작하는 경우가 많다
//        System.out.println(year + "년은 " + result);
//
//        String result2;
//        // 이제 그러면 음수 연도를 걸러내기 위해서는 어떻게 할 수 있는가
//        if (year < 0){
//            result2 = "불가능한 연도 입력입니다.";
//        }else {
//            result2 = isLeapYear ? "윤년입니다" : "윤년이 아닙니다";
//        }
//        System.out.println(year + "년은 " + result2);

        // 중첩 삼항 연산자
        String result3 = year <= 0 ? "불가능한 연도입력입니다." : ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                                                                ? "윤년입니다." : "윤년이 아닙니다";

        System.out.println(year + "년은 " +  result3);
    }
}
