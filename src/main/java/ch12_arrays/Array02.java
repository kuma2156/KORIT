package ch12_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // int 배열 선언 및 초기화
        int[] intArr01 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("intArray01 length : " + intArr01.length);
        // intArray01 에서 배열의 element 를 출력하는 방법은 해봤다
        int sum = 0;

        // 전부 더하는 반복문
        for (int i = 0 ; i != intArr01.length; i++){
            sum += intArr01[i];
        }
        System.out.println("sum : " + sum);

        // intArr01에서 짝수만 뽑아서 더하려면
        int sumEven = 0;
        for (int i = 0 ; i <= intArr01.length; i++){
            if(i % 2 == 0){
                sumEven += i;
            }
        }
        System.out.println("sumEven : " + sumEven);

        // 비어있는 배열에 (혹은 기존에 값이 있는 배열에) 값을 재대입하는 방법
        int[] intArr02 = new int[100];
        intArr02[0] = 100;
        intArr02[1] = 100;
        intArr02[2] = 100;
        intArr02[3] = 100;

        for (int i = 0; i != 100; i++){
            intArr02[i] = 100;
        }
        System.out.println(intArr02[99]);

        // 그러면 저희 intArr02에다가 다시 값을 재대입할건데
        // 1 ~ 100까지 대입
        for (int i = 0; i != intArr02.length; i++){
            intArr02[i] = 1+i;
        }
        System.out.println("arr2 [99] : " + intArr02[99]);

        int total = 0;
        // 이상의 변수를 사용하여 intArr02.의 모든 element의 합을 구하시오
        for (int i = 0 ; i != intArr02.length + 1; i++){
            total += i;
        }
        System.out.println("arr2 total : " + total);
        int total3= 0;
        // 이상의 변수를 사용하여 intArr02의 3으로 나누어떨어지는 element의 합
        for (int i = 0; i != intArr02.length + 1; i++){
            if(i % 3 == 0){
                total3 += i;
            }
        }
        System.out.println("arr2 total3 : " + total3);


        // String 3 개짜리
        String[] strArr01 = new String[3];

        // 0 번지에서 ~ 3 번지 까지 김일, 김이....
        // 입력가능하게 끔 .
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[3];
        for (int i = 0; i != name.length; i++){
            System.out.print("이름을 입력 : ");
            name[i] = scanner.nextLine();
        }

        for (int i = 0; i != name.length; i++){
            System.out.println(i + 1 + "번째 학생 이름 : " +name[i]);
        }


    }
}
