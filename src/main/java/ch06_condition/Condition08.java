package ch06_condition;

import java.util.Scanner;

/*
     과제: 윤년 계산기
     윤년(leap year) : 연도가 4로 나뉘어 떨어지는 윤년에는 해당할'수도있음'
     그러나 100 으로 나누어 떨어지는 해는 윤년이 아님
     근데 100으로 나누어 떨어지긴 하는데 400으로도 나누어 떨어지면 윤년임

     2020년은 4로 나누어 떨어지므르 윤년입니다
     1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다
     2000년은 100으로 나누어 떨어지지만 400으로 나누어 떨어지기 때문에 윤년에 해당합니다.
 */
public class Condition08 {
    public static void main(String[] args) {
        int inputYear = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        inputYear = sc.nextInt();


        if (inputYear % 4 == 0 ){
            if(inputYear % 100 == 0 && inputYear % 400 == 0){
                System.out.println(inputYear+"년은 100으로 나누어 떨어지지만 400으로 나누어 떨어지기 때문에 윤년에 해당합니다.");
            }else if(inputYear % 100 == 0){
                System.out.println(inputYear+"년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다");
            }else{
                System.out.println(inputYear+"년은 4로 나누어 떨어지므르 윤년입니다");
            }
        }else{
            System.out.println(inputYear + "년은 윤년이 아닙니다.");
        }
//        Scanner scanner = new Scanner(System.in);
//        int year;
//        System.out.print("년도를 입력하세요 : ");
//        year = scanner.nextInt();
//        String leapYear = "";
//
//        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//            leapYear = "윤년입니다.";
//        }else {
//            leapYear = "윤년이 아닙니다.";
//        }
//
//        System.out.println(year + "년은 " + leapYear);
    }
}
