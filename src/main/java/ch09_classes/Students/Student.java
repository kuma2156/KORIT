package ch09_classes.Students;

public class Student {
    int studentCode;
    String name;
    double score;
    
    Student(){
        System.out.println("기본 생성자로 생성되었습니다");
    }
    Student(int studentCode){
        System.out.println("int 생성자로 생성되었습니다");
        this.studentCode = studentCode;
    }
    Student(String name){
        System.out.println("String 생성자로 생성되었습니다");
        this.name = name;
    }
    Student(int studentCode, String name){
        System.out.println("학번과 이름으로 학생 객체 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
    }
    Student(int studentCode, String name, double score){
        System.out.println("학생 / 이름 / 점수를 등록한 학생 객체 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void showInfo(){
        System.out.println();
        System.out.println(name + "학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }
}
