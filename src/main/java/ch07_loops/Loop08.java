package ch07_loops;

import java.util.Scanner;

/*
        *
       **
      ***
 */
public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("별을 몇 줄로 찍겠습니까 : ");
        int row = scanner.nextInt();

//        // j-- 형태
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < row; j++){
//                System.out.print(" ");
//            }
//            for (int k = 0; k < row-i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for( int i = 0; i <= row; i++){
//            // 공백
//            for(int j = row; j > i; j--){
//                System.out.print(" ");
//            }
//            // 별
//            for(int k = 0; k < i; k++){
//                System.out.print("*");
//            }
//            // 개행
//            System.out.println();
//        }

        // j++ 형태
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i <= row; i++){
            for(int j = 0; j < row - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
