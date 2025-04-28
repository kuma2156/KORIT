package ch12_arrays;
/*
    String[] scores = {"A","B","C","D","F"};
    를 선언하고 반복문을 작성해서
    scores의 결과를 {"A+","B+"...}
    출력하기
    예 : A+ B+ C+ D+ F+
* */

public class Array05 {
    public void contectPlus(String[] scores){
        for (int i =0; i != scores.length; i++){
            scores[i] += "+";
        }
    }

    public void printArray(String[] arr){
        for (int i =0; i != arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Array05 arr05 = new Array05();
        String[] scores = {"A","B","C","D","F"};
//        for (int i =0; i != scores.length; i++){
//            scores[i] += "+";
//
//            System.out.print(scores[i]+ " ");
//        }

        // 메서드를 사용한 방법
        arr05.contectPlus(scores);
        arr05.printArray(scores);


    }
}
