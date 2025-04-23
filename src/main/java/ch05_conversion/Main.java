package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. Upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환 시키는 것

        System.out.println("-----업캐스팅-----");
        char cast1 ='A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 # 1
        // 형변환을 하기 위해서는 '(바꿀테이터타입)'변수명 으로 작성해야한다
        System.out.println("변형 : " + (int)cast1); // 65

        char cast2 ='a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2); // 97

        // 각 문자의 아스키코드로 변화되서 출력된건데 A 65 , a 97 은 외우도록 하자

        // 업캐스팅 방법 # 2
        char cast3 ='b';
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법
        int casted3 = (int)cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);

        // 다운캐스팅
        System.out.println("-----다운캐스팅-----");
        int cast4 = 99;
        int cast5 = 100;
        // 지시사항 : 다운캐스팅하는 방법을 업캐스팅하는 방법#1 , 2를 자참조하여 char 형으로 바꾼후
        //           콘솔창으로 출력

        // # 1
        System.out.println("원형 : "+ cast4);
        System.out.println("변형 : "+ (char)cast4);
        // # 2
        char casted5 = (char)cast5;
        System.out.println("원형 : "+ cast5);
        System.out.println("변형 : "+ casted5);

        /*
            추후 수업에서 적용될 개념인데, upcasting 의 경우 메모리 용량이 커지기만 하면 되니까
            기존 데이터가 변형이 일어나지 않기 때문에 암시적(implicit)으로 변형이 가능한 반면,
            downcasting 의 경우에는 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 되는
            경우가 있습니다. 영량 오버에 해당하는 현상을 미리 점검하기 위해
            다운캐스팅 시에는 명시적(explicit)으로만 변형이 가능합니다.
         */
    }
}
