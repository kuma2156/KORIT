package ch12_arrays;

import java.util.Scanner;

public class Array04 {
    public void writeNames(String[] names){
        // 메서드가 Scanner를 사용하기 때문에 추가적으로 method 내에서 객체를 생성할 필요
        Scanner scanner = new Scanner(System.in);
        // element 입력을 위한 반복문 작성
        for (int i = 0; i != names.length; i++){
            System.out.print(i + 1 + "번째 학생 이름 : ");
            names[i] = scanner.nextLine();
        }
    }

    public void printNames(String[] names){
        for (int i = 0 ; i != names.length; i++){
            System.out.println("names[" + i + "] : " + names[i]);
        }
    }

    public void printNames(int[] names){
        for (int i = 0 ; i != names.length; i++){
            System.out.println("names[" + i + "] : " + names[i]);
        }
    }

    public static void main(String[] args) {
        // 객체 생성
        Scanner scanner = new Scanner(System.in);
        Array04 array04 = new Array04();
        // 사용할 변수 목록도 선언
        int numOfStudents = 0;

        System.out.print("몇 명의 학생을 입력하시겠습니까 : ");
        numOfStudents = scanner.nextInt();
        // 빈 배열을 선언 
        String[] names = new String[numOfStudents];
        // 해당 빈 배열에 입력을 하는 메서드 호출
        array04.writeNames(names);
        // 채워진 배열을 출력하는 메서드 호출
        array04.printNames(names);
        // 위 처럼 처리할 경우 장점
//        String[] strArr01 = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"};
//        array04.printNames(strArr01);
        // 이처럼 코드의 재사용성을 높일수있다.

//        int[] intArr01 = {10,9,8,7,6,5,4,3,2,1,0};
//        array04.printNames(intArr01);
    }
}
