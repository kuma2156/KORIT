package ch07_loops;

public class Loop03 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

//        // 반복 100번
//        while(i < 100){
//            ++i;
//            System.out.print(i + " ");
//            if(i % 10 == 0){
//                System.out.println();
//            }
//        }
//        i = 0;

        // 반복 10번
        while (i < 10) {
            j = 1;
            while (j <= 10) {
                System.out.print(j + (i*10)  + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
