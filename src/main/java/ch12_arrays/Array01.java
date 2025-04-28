package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        // 1.
        // 자료형 [] 배열명 = {값1, 값2, ...}
        int []arr1 = {1,2,3,4,5};
        // 값1, .... 값n : element/ elem1 = 0;

        // 2. 빈 배열을 선언한 다음에 추후 값을 대입하는 방법
        String[] arr2 = new String[4]; // 방 4개 짜리 빈 배열
        arr2[0] = "김영";
        arr2[1] = "김일";
        arr2[2] = "김이";
        arr2[3] = "김삼";

        System.out.println(arr1);
        System.out.println(arr2);
        //[I@4c873330
        //[Ljava.lang.String;@119d7047
        // 결과 값이 이상하다 . 주소값을 출력하기 때문이다

        // 배열의 element를 출력하는 방법
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//        System.out.println(arr1[3]);
//        System.out.println(arr1[4]);

        // [] 반복문을 사용해서 손쉽게 표현이 가능하다
        for(int i = 0; i < 5; i ++){
            System.out.println(arr1[i]);
        }

        // arr2의 element를 출력하는 반복문
        for(int i = 0; i < 4; i++){
            System.out.println(arr2[i]);
        }

        // 그러면 역순으로 출력하려면 어떻게 할가?
        System.out.println("---  역순 출력 ---");
        for (int i = 0; i != arr1.length ; i++){
            System.out.println(arr1[arr1.length - 1 - i]);
            // arr1.length - 1 을 한 이유는 length로 반환 된 int 값은 5
            // 4 3 2 1 0 이 되야하기 때문에 시작값 4로 만들었다.
        }
        // arr1에 각 값에 2를 더하고 싶으면?
        for (int i =0; i < arr1.length; i++){
            arr1[i] += 2;
            System.out.println("arr1 + 2 : " + arr1[i]);
        }

        System.out.println("--------");
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        // 배열명.length  : 배열의 크기
        // >> 객쳄명.속성명과 동일 결과값은 int이 반환된다

        for (int i =0 ; i < arr2.length; i++){
            System.out.print(arr2[i] + "님 ");
        }

        // md 파일에 정리한대로라면 String 참조 변수에 해당하고
        // 참조 변수들을 모아서 다시 배열을 만들 수 있다는 점

    }
}
