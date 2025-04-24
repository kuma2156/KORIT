package ch07_loops;

import java.util.Scanner;

public class Loop06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별찍기를 설정하시겠습니까 : ");
        int row = scanner.nextInt();

        // 별찍기 피라미드 형식
        // row 변수를 활용해서
        for (int i= 0; i <= row; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 별찍기 역피라미드 형식
        for (int i = 0; i < row; i++){
            for(int j = 0; j < (row-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
