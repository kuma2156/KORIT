package ch23_lambda;

public class CalculateMain {

    // 정적 메서드 정의
    public static int operate(int a , int b, Calculator c){
        return c.calculate(a,b);
    }
    public static void main(String[] args) {
        Calculator add = (x , y) -> x + y;
        Calculator sub = (x , y) -> x - y;
        Calculator mul = (x , y) -> x * y;
        Calculator div = (x , y) -> x / y;      // y가 0이면 예외발생

        // 정적 메서드 호출
        System.out.println("2 + 3 = " + operate(2,3,add));
        System.out.println("2 - 3 = " + operate(2,3,sub));
        System.out.println("2 * 3 = " + operate(2,3,mul));
        System.out.println("2 / 3 = " + operate(2,3,div));

        Calculator div2 = (x, y) -> {
            if (y == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };
//        System.out.println("4 / 0 = " + operate(3,0,div));
        System.out.println("4 / 0 = " + operate(3,0,div2));
    }
}
