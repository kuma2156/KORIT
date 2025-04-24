package ch08_methods;

import java.util.Scanner;

public class Method02 {
    // 한 방에 자기 소개 하는 메서드를 정의합니다
    public static void introduce(){
        // 내부에서 Scanner import
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.println("제 이름은 "+ name + "\n주소는 "+ address);
    }
    /*
        실행 예 
        학번 입력 : 
        이름 입력 : 
        학번 : 
        이름 : 
        main 단계에서 학생 수를 입력합니다.
        
        실행 예
        몇 명의 학생을 등록하시겠습니까 : 
        학번 입력:
        이름 입력: 
        학번 : 
        이름 : 
        
        입력한 횟수만큼 
        학번 : 
        이름 : 
        ...
        출력하기
     */
    // 출석부를 만듭니다
    public static void registerStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("학번을 입력하세요 : ");
        int studentNum = scanner.nextInt();

        System.out.println("학번 : "+studentNum);
        System.out.println("이름 : "+name);
    }

    // 2 argument를 받아 반복하는 방식
    public static void registerStudent2(int studentCount) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < studentCount; i++) {
            System.out.print("이름을 입력하세요 : ");
            String name = scanner.nextLine();
            System.out.print("학번을 입력하세요 : ");
            int studentNum = scanner.nextInt();
            scanner.nextLine();

            System.out.println("학번 : " + studentNum);
            System.out.println("이름 : " + name);
        }
    }
    public static void main(String[] args) {
//        introduce();
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까 : ");
        int studentCount = scanner.nextInt();

        for(int i = 0; i < studentCount; i++){
            registerStudent();
        }
        System.out.println("2. argument를 받아 하는 방식");
        registerStudent2(studentCount);
    }

}
