package ch22_exception;
/*
    사용자 정의 예외

* */

class LoginFailedException extends Exception{
    public LoginFailedException(String message) {   // 생성자를 생성
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}
public class Exception2 {

    public static void login(String id , String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        if (!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1111";

        try {
            login(inputId,inputPassword);
        }catch (LoginFailedException e){
            System.out.println("로그인 실패 : " + e.getMessage());
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
/*
    String age = "123";
    그럼 얘가 수학으로 연삭ㄴ이 안된다
    이걸 Java 특정 클래스의 특정 메서드는 저런식으로 String 숫자 형태를 int로 바꿔주는 메서드가 있다
    그건 시험문제
* */