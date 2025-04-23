package ch06_condition;
/*
    switch 문
    형식 :
    switch(변수명){
        case 조건1 :
            실행문1
            break;
        case 조건2 :
            실행문2
            break;
        case 조건3 :
            실행문3
            break;
         default :
            실행문4
        }
 */

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int selectNum;
        String selectedChar;
        System.out.println("[메뉴 선택]");
        System.out.println("a. 1번메뉴");
        System.out.println("b. 2번메뉴");
        System.out.println("c. 3번메뉴");
        System.out.println("d. 4번메뉴");
        System.out.println("e. 5번메뉴");
        System.out.print("메뉴를 선택하세요 : ");
        selectedChar = scanner.nextLine();

//        // if 문으로 만약 선택했을 경우
//        if (selectNum < 1  || selectNum > 5){
//            System.out.println("불가능한 메뉴 번호입니다.");
//        }else if(selectNum == 1){
//            ....
//        }
        // 이런식으로 굉장히 코드가 난해하다
        // 이런 코드를 스위치문으로 활용해서 코드의 직관성을 높인데
        switch (selectedChar){
            case "a" :
                System.out.println("메뉴 1을 선택하셨습니다");
                break;              // 조건문을 탈출한다는 의미
            case "b" :
                System.out.println("메뉴 2을 선택하셨습니다");
                break;
            case "c" :
                System.out.println("메뉴 3을 선택하셨습니다");
                break;
            case "d" :
                System.out.println("메뉴 4을 선택하셨습니다");
                break;
            case "e" :
                System.out.println("메뉴 5을 선택하셨습니다");
                break;
            default:                // 아무 조건에도 해당되지 않으면 실행
                System.out.println("불가능한 메뉴 선택입니다.");
        }

    }
}
