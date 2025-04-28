package ch12_arrays;
/*
    향상된 for문

    일반 for문과의 차이점 :
        일반 for문의 경우 인덱스 넘버(주소지)를 병확하게 알고 있어야 하지만 일일이 element 숫자를 세는 것이 번거롭기 때문에
        배열명.length를 사용했다

        그런데 잘 생각해보면 for 문의 int i 는 for 문의 내부에서 선언된다
        (일종의 지역변수)
        index 넘버의 사용 없이 바로 적용이 가능한 반복문이 존재하는데
        이를 향상된 for문이라고 한다

        제약 :
            읽기만되고, 쓰기가 안된다 (예를 들어서 1부터 100까지 추출하는건 되는데 1부터 100까지 입력은 불가능할때가 있다)

        형식 :
            for(자료형변수 : 반복가능객체(배열)){
                반복실행문
            }
* */
public class Array06EnhanceFor {
    public void printElem(int[] arr){
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
    public void printElem(String[] arr){
        for (String i : arr){
            System.out.print("/"+i +" ");
        }
    }

    public static void main(String[] args) {
        Array06EnhanceFor array06EnhanceFor = new Array06EnhanceFor();
        int[] numbers = new int[200];
        // 1 ~ 200
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // 배열에 1부터 200까지 값 넣기
        }

//        for (int i : numbers) {
//            System.out.print(i + " "); // i는 배열의 각 요소를 출력
//        }

        String[] names = {"강미경", "김광호", "김규철", "김대웅", "김명규", "김민성", "김민효",
                "김서준", "김선영", "김재원", "김종보", "김호섭", "노소정", "염진우", "예영근",
                "이수원", "이진혁", "정선유", "제다정"};

        // for문을 통해 이름을 강미경 / 김광호 / 김규철 / 김대웅 ... / 제다정 으로 출력하시오.
//        for(String str : names){
//            System.out.print(str+ " ");
//        }
        System.out.println();
        // printElem(배열) 형태로 메서드로 정의하시오. -> int배열과 String 배열에 다 사용할 수 있도록
        // method overloading도 적용하시오.
        array06EnhanceFor.printElem(names);
        System.out.println();
        array06EnhanceFor.printElem(numbers);
    }
}
