package ch07_loops;
/*
    for 반복문(for loop)
    : 대부분의 경우에 명확하 횟수가 고정되어 있을 때 사용하는 반복문 
    
    형식 : 
    for (시작값 ; 종료값 ; 증감값){
        반복실행문
    }
 */
public class Loop04 {
    public static void main(String[] args) {
        int sum = 0;
        // 1부터 100까지 합을 구하는 for문
        for(int i = 0 ; i < 101; i ++){
            sum += i;
        }
        System.out.println(sum);

        int sum2 = 0;
        // 1부터 100까지 중 홀수 합을 구하는 for문을 작성하시오
        for(int i = 1; i < 100; i +=2){
            sum2 += i;
        }
        System.out.println(sum2);

        int sum3 = 0;
        // if 문 사용
        for(int i = 1; i < 100; i++){
            if(i % 2 == 1){
                sum3 += i;
            }
        }
        System.out.println(sum3);
    }
}
