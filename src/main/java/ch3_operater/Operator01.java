package ch3_operater;
/*
    camel case : Java 변수 표기법
    snake case : Python 변수 표기법
    pascal case : 첫 문자가 대문자 나머지 소문자로 가다가 두 번째 단어 첫 번째 문자는 또 대문자 작성
        ex) 한 단어 짜리 : Operator01
        ex) 두 단어 짜리 : OperatroTest
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // 여기서 자료형, 변수명, 데이터에 대해서는 학습했습니다.
        // '=' 를 배웁시다
        /*
            대입 연산자 = : 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 '대입한다' 라는 의미로, 변수와 데이터가 동일하다는
            수학적인 의미가 아니다.
         */

        int i2 = 20;
        i2 = i2 + 30;
        System.out.println(i2);             // 왼쪽과 오른쪽이 같다고 표시할 때는 ==

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지
         */
        int a = 5;
        int b = 2;
        double result = (double)a / b;
        System.out.println(result);
        System.out.println(a % b);
    }
}
