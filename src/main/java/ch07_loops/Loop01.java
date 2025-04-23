package ch07_loops;
/*
    while 반복문
    형식 :
    while (조건식) {
        반복실행문
    }
    while(조건식) 뒤에 나오는 조건식을 봤을 때 if(조건식) 형태와 유사하다
    즉, while() 내의 조건식이 true 일 경우 {} 내 실행문이 반복적으로 이루어집니다

    그래서 주의할 점이있는데
    while 내부의 조건식이 트적 시점에서 false가 되도록 미리 지정해둘 필요가 있습니다

    false가 되는 시점을 지정하지 않으면 무한히 반복되는 무한 반복(infinite loops)가 되버립니다.
 */
public class Loop01 {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 100){
////            i++;
////            System.out.println(i);
//            System.out.println(++i);
//        }
//

        // while 문도 중첩이 일어날 수 있다
        /*
            while(조건문1){
                반복실행문1
                while(조건문2){
                    반복실행문2
                }
            }

         */

        int sum = 0;
        int k = 1;
        // 예를 들어 1부터 100까지 더하도록 하겠습니다
//        while(k < 101){
//            sum += k;
//            k++;
//        }
//        System.out.println(sum);
        
        // 응용 1 부터 100까지 짝수합을 구하는 while 반복문을 작성하시오
        // if 문을 활용한 방법
        while(k < 101){
            if(k % 2 == 0){
                sum += k;
            }
            k++;
        }
        System.out.println("첫 번째 방식 : " + sum);

        k = 0;
        sum = 0;
        
        // 두 번째 방식
        // += 2 를 활용한 방법 주의 할 점 !! 시작이 짝수이어야 한다
        while(k < 101){
            sum += k;
            k += 2;
        }
        System.out.println("두 번째 방식 : " + sum);
        
    }
}
