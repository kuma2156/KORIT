package ch07_loops;
/*
    중첩 while 문

 */
public class Loop02 {
    public static void main(String[] args) {
        // 곱하기 만들기
        /*
            2 x 1 = 2
            ...
            9 x 9 = 81
         */
        int i = 2 ;
        int j = 1;
        while (i <= 9){
            while(j <= 9){
                System.out.println(i + " x " + j + " = " + (i*j));
                ++j;
            }
            ++i;
            j = 1;
        }

    }
}
