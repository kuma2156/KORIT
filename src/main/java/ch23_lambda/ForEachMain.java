package ch23_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // list 생성 > 여태까지 안 쓴 방법
        List<String> fruits = Arrays.asList("Apple","Banana","Grape");

        // forEach
        fruits.forEach(fruit -> System.out.println("과일 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println("두 배 값 : " + (number * 2)));
    }
}
