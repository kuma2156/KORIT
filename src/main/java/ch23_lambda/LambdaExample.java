package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
//        // 익명 클래스 방식
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello Java");
//            }
//        };
//
//        // run 메소드 실행
//        runnable.run();
//
//        // 람다식
//        Runnable lambdaRunnable = () -> System.out.println("Hello java Lambda");
//
//        lambdaRunnable.run();

        // 1. Supplier > call2() 유형의 함수형 인터페이스
        Supplier<String> stringSupplier = () ->"Hello Functional Interface and Lambda!";
        // 2. Consumer > call3() 유형의 함수형 인터페이스
        Consumer<String> stringConsumer = (message) -> System.out.println("메시지 : " + message);
        // 3. Supplier 로 부터 값을 생성하고나서 Consumer 를 통해서 출력하기
        String message = stringSupplier.get(); // message 변수에 "Hello Functional Interface and Lambda!" String 데이터 대입
        stringConsumer.accept(message);
    }
}
