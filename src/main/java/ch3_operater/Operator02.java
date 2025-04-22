package ch3_operater;
/*
    논리 연산자
    
    true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false 를 구분하는 자료형

    AND(&&) : 곱 연산자 T x T = T / T x F = F / F x F = F : 즉 하나라도 false 일 경우 false
    OR(||)  : 합 연산자 T x T = T / T x F = T / F x T = T : 즉 하나라도 true 일 경우 true
    NOT(!)  : true 값을 false 로, false를 true로 역전 시키는 연산자

 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("----- && 연산자 -----");
        boolean result1 = flag1 && flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag1;
        System.out.println("F x T = " + result3);
        boolean result4 = flag2 && flag2;
        System.out.println("F x F = " + result4);

        System.out.println("----- || 연산자 -----");
        boolean result5 = flag1 || flag1;
        System.out.println("T x T = " + result5);
        boolean result6 = flag1 || flag2;
        System.out.println("T x F = " + result6);
        boolean result7 = flag2 || flag1;
        System.out.println("F x T = " + result7);
        boolean result8 = flag2 || flag2;
        System.out.println("F x F = " + result8);


        boolean result9 = (flag1 || flag2) && flag2;  // and 연산자가 우선순위가 높다
        System.out.println(result9);

        boolean result10 = flag1 && flag2 && flag2;
        System.out.println(result10);               // false

        boolean result11 = 10 % 3 == 0;
        System.out.println("10 / 3 연산의 나머지는 0 이다 ? " + result11);
    }
}
