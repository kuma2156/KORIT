package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            ,next() : String  데이터를 받을 때 띄어쓰기를 인정하지 않음
            .nextLine() : String  데이터를 받을 때 띄어쓰기를 인정함 enter 키 기준으로 데이터가 입력된다

            실행 예
            이름을 입력하세요 >>> 김명규
            나이을 입력하세요 >>> 27
            주소를 입력하세요 >>> 부산 남구

            안녕하세요, 제 이름은 김명규 입니다 . ~~~~~ 에 살고 있습니다
            10년 후 나이는 27 +10 살입니다.
         */

        // Scanner 클래스 import
        // 변수 선언 및 입력
        // 프롬프트 입력

        // Scanner 클래스 import
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        int age10 = 10 + age ;
        sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();

        // 프롬프트 입력
        System.out.println("안녕하세요 제 이름은 "+ name + " " + address + "에 살고 있습니다. ");
        System.out.println("10년 뒤 나이는 "+ age10 + "입니다.");
    }
}
