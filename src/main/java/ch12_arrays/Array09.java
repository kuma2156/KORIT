package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array09 {
    public static void main(String[] args) {
        // 배열의 정렬
        Integer[] nums = {8,4,5,1,2,7,10,6,9,3};
        // 배열 출력
        System.out.println(Arrays.toString(nums));
        // 오름차순 정렬 오름차순으로 정렬하는 `정적메서드`
        // 특이점은 메서드 작용 결과를 변수에 대입하지 않았다는 점
        // 그 의미는 원본 배열인 nums를 그냥 다 바꿔버렸다는 의미로 해석할 수 있습니다.
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int num : nums){
            System.out.print(num + " ");
        }

        // 내림차순 정렬
        Arrays.sort(nums, Comparator.reverseOrder()); // 원본 배열을 변환
        System.out.println();
        System.out.println(Arrays.toString(nums));

        // int 와 integer 는 다르다.
        // int 기본자료형 : primitive type 
        // integer 는 정수 관련된 field 및 method들을 모아둔 class에 해당
        // char 자료형들의 특징들을 모아서 field / method들을 정의해둔 것이 String


    }
}
