package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi demenstional Array) 중 2차원 배열
    : 다차원 배열은 2차원 배열 이상을 의미하지만 , 개발 환경 상 2차원 배열 이상을 다루는 경우
        극히 드물기 때문에 2차원 배열을 기준으로 강의

     형식 :
     int[][] arr01 = new int[크기][크기]            # 1
     int[][] arr02 = new int[크기][]               # 2
     int[][] arr03 = {{1,2,},{3,4},{5,6}};        # 3
     
     2차원 배열의 선언 시 , '열'의 크기는 지정하지 않아도 되지만 '행'의 크기는 항상 지정해야 함
     > 선언 방식#2를 말로 풀어낸 설명
     1열 2열(column)
     🔻 🔻
     {1 ,2},   ◀  1 행
     {3 ,4},   ◀  2 행
     {5 ,6},   ◀  3 행

* */
public class Array07 {
    public static void main(String[] args) {
        int[][] arr03 = {{ 1, 2,},
                         { 3, 4 },
                         { 5, 6 }
        };

        // 5를 출력
        System.out.println(arr03[2][0]);

        // 2차 배열의 element 출력방법

        // 생각해보면 1차 배열의 각 element 들이 배열
        // 2차원 배열의 요소 출력 방법
        for (int[] arr : arr03) {  // arr는 각 행을 나타냄
            System.out.println(Arrays.toString(arr));  // 각 행을 출력

            // 각 행의 요소를 하나씩 출력
            for (int arrInt : arr) {  // arr는 하나의 행을 의미
                System.out.println(arrInt);  // 행의 각 요소를 출력
            }
        }

        for (int i = 0; i < arr03.length; i++){
            System.out.println(arr03[i]);
            for (int j = 0; j < arr03.length; j++){
                System.out.println(arr03[i][j]);
            }
        }
    }
}
