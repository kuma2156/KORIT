package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

//        String name;
//        name = "김명규";
        Scanner scanner = new Scanner(System.in);
        /*
            System.out.println() 의 경우 실행하고 나서 개행 enter 이 들어간 상태로 줄바꿈이 된다
            ln : line new
            System.out.print() 의 경우 개행이 안이루어 진다.
         */

//        System.out.print("올해는 몇년도 인가요 ? : ");
//        int year = scanner.nextInt();
//        scanner.nextLine();                     // enter 키를 받아주는 배리어 역할
//        System.out.println("년도 : " + year);
//        System.out.print("이름을 입력하세요 : ");
//        String name = scanner.nextLine();
//        System.out.println("이름 : " +name);

        /*
            nextLine() vs next...() (int, Double... etc)
            nextLine() 은 띄어쓰기를 허용하고 enter 키를 누른 것을 기준으로 데이터를 대입한다
            반면 나머지는 띄어쓰기를 허용하지 않고 데이터를 대입한다

            이상의 이유로 next...() 등들은 먼저쓰고 ,
            그 다음으로 nextLine()을 사용하면 생기는 문제가 있다

            next...() 다음에 엔터를 입력하면
            그 다음줄에 nextLIne()에 값을 넣지 않고 바로 넘겨버리는 현상이 발생한다.

            해당 문제 상황을 해결하는 위한 방법 :
            nextLine() 이 미리 enter 키를 받아들여서 name 에 아무런 값도 입력하지 않고 씹고 지나가는 상황이라고 할 수 있다

            >> enter 키를 받아주는 애가 있으면 된다.
            
            자 그런데 , 아까 전에 정리한거 기준으로
            선언된 변수의 자료형에 따라 scanner.next() 가 자동으로 생성됩니다.
            
         */
//        System.out.print("대학을 입력하세요 : ");
//        String univ = scanner.next();           // next() 를 사용하면 띄어쓰기를 인정하지 않는다.
//        System.out.println(univ);
        // 즉 문자열을 입력받을 때에는 nextLine() 을 사용한다고 생각하자

        // String 데이터를 입력할 때는 .next()  , nextLine() 두 가지 사용 가능하다
        // 차이점은 md 에 작성 정리
//        System.out.print("키를 입력하세요 : ");
//        double height = scanner.nextDouble();
//        System.out.println(height);

        /*
            1. 다음과 같이 콘솔에 출력 될 수 있도록 작성해보자
            나이를 입력하세요 >>> 19
            저는 올해 19살 입니다
            내년에는 20살이 됩니다.

            2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            점수를 입력하세요 >>> 4.5
            이름을 입력하세요 >>> 김명규
            김명규 학생의 점수는 4.5입니다.
         */
//        // 1.
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.println("저는 올해 "+ age + "살입니다.");
//        System.out.println("내년에는 " + (age+1) +"살이 됩니다.");

        // 2.
        System.out.print("점수를 입력하세요 >>> ");
        double score = scanner.nextDouble();
        scanner.nextLine();                         // 배리어
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.println(name + "의 학생의 점수는 " + score + "입니다.");



    }
}
