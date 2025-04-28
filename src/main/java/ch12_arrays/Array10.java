package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        // 이상의 2차배열에 1 ~ 100까지 값을 넣기
        
         // ArraysdeepToString(nums)를 통해 출력
        /*
            [1,2,3,4,5],
            [6,7,8...]
            ...
            [... , 100]
        * */


        int num = 1;
        for (int i = 0 ; i < nums.length ; i++){  // nums.length 는 == 20
            for (int j = 0; j < nums[i].length; j++){ // nums[i].length == 5
                nums[i][j] = num++;
            }
        }
        // 2차원 배열이므로 deepToString() 출력
        System.out.println(Arrays.deepToString(nums));

        
    }
}
