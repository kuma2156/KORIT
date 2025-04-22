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
//        int i = 10;

        // 여기서 자료형, 변수명, 데이터에 대해서는 학습했습니다.
        // '=' 를 배웁시다
        /*
            대입 연산자 = : 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 '대입한다' 라는 의미로, 변수와 데이터가 동일하다는
            수학적인 의미가 아니다.
         */

//        int i2 = 20;
//        i2 = i2 + 30;
//        System.out.println(i2);             // 왼쪽과 오른쪽이 같다고 표시할 때는 ==

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지
         */
//        int a = 5;
//        int b = 2;
//        double result = (double)a / b;
//        System.out.println(result);
//        System.out.println(a % b);


        /*
            복합 대인 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */

//        int num1 = 1;
//        System.out.println(num1);
//        num1 += 2;                          // num1 = num1 + 2
//        System.out.println(num1);
//        num1 -= 1;
//        System.out.println(num1);           // num1 = num1 - 1
//        num1 *= 10;
//        System.out.println(num1);           // num1 = num1 - 1
//        num1 /= 5;
//        System.out.println(num1);           // num1 = num1 - 1
//
//        int j = 10;
//        System.out.println(j);
//        System.out.println(j++);               // 변수명 ++ : 코드를 실행시킨 후에 j 에 1을 추가
//        System.out.println(j);                 // 그래서 다시 j를 출력했을 경우 11로 출력된다
//        System.out.println(++j);               // 실행시키기 전에 +1 를 하고 출력된다
//        System.out.println(j);                 // 결과값은 역시 동일하게 12
//        System.out.println(j--);               // 변수명 -- : 코드를 실행 시킨 후에 j 에 1을 뺀다
//        System.out.println(j);                 // 11
//        System.out.println(--j);               // --변수명 : 코드를 싱행시키기 전에 j에 1을 뺀다

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + age + 1+ "살이 됩니다");        // 값이 데이터형태가 문자열이니 타입캐스트를 진행해야한다
                                    // 101 로 출력된다 ...
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다");     // 이런 식으로 괄호를 활용해서 연산을 먼저 실행하는 방법도 있다
        

    }
}
