package ch07_loops;
/*
    몇 줄의 별을 찍겠습니까 :
    ###
    ##
    #
 */

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 찍겠습니까 : ");
        int row = scanner.nextInt();

        // Loop06 의 2번풀이 역피라미드
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < row-i; j++){
                System.out.print(" #");
            }
            System.out.println();
        }
        // 오늘 복습 시간에 md 파일 정리할때 # 1 풀이법으로 적용하기

    }
}
