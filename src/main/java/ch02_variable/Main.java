package ch02_variable;

import java.util.Currency;

/*
   주석(Comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데 ,
                   거기서 오류가 하나라도 발생하면 전체 프로그램을 실행하지 않는다
                   하지만 주석 처리가 되어 있는 부분은 컴퓨터가 코드로 인식하지 않기 때문에
                   오류가 발생하지 않는다.

                   즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을 수 있는 데에 의의가 있습니다.

                   1) 한줄 주석 : //
                   2) 다중 주석 : / + shift * + enter
                   3) 사후 주석 : 주석 처리할 부분의 코드라인에 ctrl + \ or ctrl + /
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 제 이름은 김명규입니다.");
//        System.out.println('asdasdsd'); '@' 인자 안에는 하나의 값만 들어감
        System.out.println(12132);              // 123132
        System.out.println("1");                // 1
        System.out.println(1 + 2);              // 3
        System.out.println("1 + 2");            // 1 + 2
        System.out.println("1" + "2");          // 12
        System.out.println("1" + 2);            // 12

        // 이상과 같은 방식의 코드 대입을 "하드 코딩"이라는 표현을 씁니다.
        // 명령문애 데이터를 바로 집어 넣는 것 (변수에 대입되지 않은 데이터를 -리터럴(literal))
        // 데이터를 변수에 대입하고, 변수를 통해서 명령을 내리는 것이 권장됨.
        
        /*
            변수(Variable) : 데이터를 담는 바구니 -> 이름표를 꼭 달아줘야함
            변수 선언 방법 :
            자료형 변수명 = 데이터;

         */

         int scoreEngilsh = 100;
        System.out.println(scoreEngilsh);

        String introduction = "안녕하세요. 저는 Java 를 배우고 있는 김명규입니다";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");

        // 변수의 의미에 주목해보면 데이터 값이 바뀔 수 있음을 뜻합니다.
        scoreEngilsh = 90;
        System.out.println(scoreEngilsh);

        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓 (true/ false)
        //  자료명 변수명 = 데이터 ;       >>    변수의 선언 및 초기화
        boolean checkFlag = false;        // 참 거짓에 많이 사용하는 단어 Flag

        // 변수에 데이터를 재대입
        checkFlag = true;

        boolean checkFlag2;               // 변수의 선언
        checkFlag2 = true;                // 변수의 초기화
        checkFlag2 = false;               // 변수의 재대입

        // 2. 문자 자료형 char : 문자가 하나만 들어갑니다.
        char name1 = '김';
        char name2 = '명';
        char name3 = '규';
        // char -> 문자 /  String -> 문자열

        System.out.println(name1 + name2 + name3);      // 136865
        System.out.println("" +name1 + name2 + name3);  // 김명규

        /*
            이상의 코드에서 알 수 있는 점은 컴퓨터는 생각보다 멍청해서 개발자인 저희가
            하나하나 지정을 해줘야하 한다는 점이다. 문자와 문자열은 서로 다른 개점인데,
            문자(하나짜리) 세번을 더했을 경우에 더이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않습니다 (64라인)

            그렇기 때문에 저희는 65번라인 에서 sout()의 ()안에 "" 를 넣어줌으로써
            ()내부가 전체적으로 문자"열"로 인식되도록 ㄲ모수를 부렸다고 할 수 있습니다

            여기서 알 수 있는 점은 sout() 에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점입니다.
         */

        System.out.println("123" + 1);          // 1231
        System.out.println(123 + "1");          // 1231 > 애는 예외

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);    // 숫자끼리 연산이 가능합니다.
        String width3 = "100";
        String width4 = "200";
        System.out.println(width3 + width4);    // 100200 문자열끼린 연산이 아니라 열을 붙임이다.
        System.out.println(width4 + width3);    // 200100

        // 4. 실수 자료형 변수 double
        double pi = 3.1415926;
//      int pi2 = 3.14;                         // 오류 발생
        // +  -  * /
        // pi 변수를 이용하여 원의 반지름이 43인
        // 원의 둘레 및 넓이를 구하시오 >>
        // 원의 둘레 공식 : 지름 x pi
        // 원의 넓이 공식 : 반지름 제곱 x pi

        int circle = 43;
        System.out.println("원의 둘레 : " + circle * 2 * pi);
        System.out.println("원의 넓이 : " + circle * circle * pi);

        /*
            Java 에서의 변수 표기 방식 :
                1. 카멜 표기법(Camel case) 를 사용
                    : 첫 문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우
                      두 번째 단어의 첫 번째 문자만 대문자
                      ex) 한 단어 짜리 : result
                      ex) 복수 단어 :   myTestResult
                2. 특수 문자 지양
                
                cf) 파이썬 학습하신 분들은 파이썬 변수 표기  방식은 snake case 라고 해서
                , my_test_result 와 같은 방식으로 작성합니다.


         */

        // 5. 문자열 자료형 변수 String
        // 주의해야할 점 : 얘는 대문자인데 나중에 머리 아픈 일들이 생기게 됩니다,.
        String name = "김명규";
        String major = "컴퓨터공학과";
        String currentJob = "학생";
        String previousJob = "학생";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);
        // 이상과 같이 변수ㅠ에 대입하고 그 변수를 그대로 출력하는 방법이 가능합니다.
        // 하지만 아까 봤던 것처럼

        System.out.println("안녕하세요 제 이름은 " + name + "입니다" + " 제 전공은 " + major + "이고, 그래서 예전 직업은 "
                + previousJob +"이었습니다" + " 현재는 " + currentJob +"입니다.");

        // 이와 같은 방식으로 literal 과 연결 지어서 사용할 수 있다

        // 연습
        // 변수를 선언
        String name4;
        String major4;
        String mbti4;
        int age4;

        // 데이터를 초기화하고
        name4= "김명규";
        major4 = "컴퓨터공학과";
        mbti4 = "INFP";
        age4 =27;

        System.out.println("저는 코리아 it 아카데미 4월 국비 과정을 수강하고 있는 " + name4 + "입니다. " + age4+ "살입니다."
                +"제 전공은 "+ major4 + "이며, MBTI 는 " + mbti4 +"입니다.");



    }
}
