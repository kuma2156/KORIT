package ch22_exception;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
//        int a = 10;
//        Scanner scanner = new Scanner(System.in);
//        int b = scanner.nextInt();
//        try {
//            int result = a / b; // 예외 발생
//            System.out.println("결과 : " + result);
//        }catch (ArithmeticException e){
//            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
//        }finally {
//            System.out.println("프로그램 정상 종료");
//        }
//
        // 배열 인덱스 예외
        int[] numbers = {1,2,3};

        try {
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){ // 예외 중 가장 상외 예외 클래스가 Exception 이다
            System.out.println("배열의 인덱스를 초과하는 값입니다. : " + e.getMessage());
        }finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}
