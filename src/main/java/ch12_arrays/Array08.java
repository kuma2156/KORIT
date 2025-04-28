package ch12_arrays;

import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {

        // 1차 배열
        String[] students = {"김일","김이","김삼"};
        // 2차 배열
        double[][] scores = {
                {100.0,96.4},
                {64.2,79.3},
                {80.2,44.5}
        };

        /*
            배열의 출력
            sout(arr) 형태로 배열을 출력하게 되면 배열은 참조변수이기 때문에 주소값만 출력된다
            그리고 반복문을 통해 element를 불러올 수 있다.(for / enhanced for)
            하지만 배열 전체를 확인하는 방법은 없다

            Arrays 클래스를 사용해 정적 메서드 .toString(배열명)을 사용하면 배열 전체 출력가능

            이상에서 중요한 점은
            클래스명.메서드명()으로 호출된다는 점이다 즉 > Arrays.toString(배열명);
            즉 저희가 method 패키지에서 학습했던 것 중에 .메서드명() 객체명.메서드명()
            이번이 처음으로 클래스명.메서드명();

        * */
        // 1. 1차 배열의 출력
        System.out.println(Arrays.toString(students)); // 결과값 : [김일, 김이, 김삼]
        System.out.println(Arrays.toString(scores)); // 결과값 : [[D@4c873330, [D@119d7047, [D@776ec8df]

        // 2. 2차 배열의 출력
        // 형식 Arrays.deepToString(배열명)
        System.out.println(Arrays.deepToString(scores));  // 결과값 : [[100.0, 96.4], [64.2, 79.3], [80.2, 44.5]]




    }
}
