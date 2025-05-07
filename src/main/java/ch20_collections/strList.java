package ch20_collections;

import java.util.*;

public class strList {
    public static void main(String[] args) {
        // 비어있는 List 생성 방법
        List<String> strList1= new ArrayList<>();
        // 배열과의 차이점도 볼 필요가 있다
        String[] strArray1 = new String[2]; // 배열은 인덱스 넘버를 고정해야한다
        // 리스트는 인덱스 넘버를 선언하지 않아도 생성이 가능하다.
        // 배열에 Element를 넣는 방법
        strArray1[0] = "김영";
        // List에 Element를 넣는 방법
        strList1.add("Java");
        strList1.add("Python");
        strList1.add("C#");
        strList1.add("Java Script");
        strList1.add("Kotlin");
        strList1.add("Java");

        // 출력
        System.out.println(Arrays.toString(strArray1)); // 배열은 출력하기 위해 static 메서드를 경유해야함
        System.out.println(strList1);

        // 특정 Element 의 포함 여부 검색 > contains() 메서드를 사용  > return boolean
        String searchElem1 = "Java";
        boolean contain1 = strList1.contains(searchElem1);
        System.out.println("strList1에 Java의 존재 여부 : " + contain1);

        String searchElem2 = "Ja";
        boolean contain2 = strList1.contains(searchElem2);
        System.out.println("strList1에 Ja의 존재 여부 : " + contain2);

        String email = "a@test.com";
        boolean contain3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + contain3);
        // String 의 경우 char 들이 '순서대로' 나열된 것이기 때문에 char 하나가 포함된 것을
        // contains() 메서드를 통해 부분 검색이 가능하지만,
        // searchElem2 의 경우 '완전히' 일치하는지 확인하기 때문에
        // false로 나온다.

        // 특정 element의 삭제 > remove()
        String removeElem1 = "Java";
        boolean removed1 = strList1.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removed1);
        System.out.println(strList1);

        // 마찬가지로 .remove() 역시 element 전체가 일치하는지 확인하기 때문에
        // element 일부만 가지고 삭제하는 것이 불가능하다
        // 또한 removeElem2 = "Ja" 를 했을 경우
        // "va"만 남기는 것은 불가능하다.

        String removeElem2 = "Ja";
        boolean removed2 = strList1.remove(removeElem2);
        System.out.println(removeElem2 + "의 삭제 여부 : " + removed2);
        System.out.println(strList1);

        // List의 정렬 > 배열과 동일
        Collections.sort(strList1);
        System.out.println("정렬된 List : " + strList1);

        // 역순 정렬
        Collections.sort(strList1,Collections.reverseOrder());
        System.out.println("역순 정렬된 List : " + strList1);

        // 배열과 유사하게 element 들을 다 뽑을 수 있다
        // python 언어 , java 언어 , JavaScript 언어 , C# 언어로 출력될 수 있도록 작성하시오
        // 참고 : strList1.lenth는 안먹는다.
//        String temp;
//        for(int i = 0; i < strList1.size(); i++){
//            if(strList1.get(i) != null){
//                temp = strList1.get(i) + " 언어";
//                strList1.remove(strList1.get(i));
//                strList1.add(temp);
//            }
//        }
//        System.out.println(strList1);
        for(int i = 0; i < strList1.size(); i++){
            if(strList1.get(i) != null){
                strList1.set(i, strList1.get(i) + " 언어");
            }
        }
        System.out.println(strList1);

//        for(String elem : strList1){
//            System.out.println(elem + "입니다");
//        }

        // 이상의 코드에서 알 수 있는 점은
        // 배열과 달리 리스트명.size()를 사용 lenth() 대신에
        // 출력할때도 리스트명.get()을 사용
        // 배열의 경우 배열명.lenth , 배열명[i]
    }

}
