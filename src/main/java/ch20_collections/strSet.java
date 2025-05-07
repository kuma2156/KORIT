package ch20_collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 허용하는 반면에 Set은 순서는 없고 중복도 허용하지 않는다.
    수학에서는 집합개념을 Collection 으로 구현한 것이 Set에 해당한다
    그래서 특성차이로 인해 형변환이 매우 중요
    List 를 통해 전체  설문을 받고 Set을 통해 중목을 제거하여 후보군들만 남기는 등의
    응용이 가능하기 때문에 , 혹은 Set을 List로 바꿔 .get(인덱스 넘버) 를 통해 조회를 하기 위해서 
    서로 간의 형변환이 매우 중요하다
* */
public class strSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet1 = new HashSet<>();
        // 형변환이 중요하다 했으니깐 List도 하나 만든다
        List<String> strList1 = new ArrayList<>();

        // Set에 element 삽입 > .add()
        strSet1.add("java");
        strSet1.add("python");
        strSet1.add("c");
        strSet1.add("1");
        strSet1.add("java");

        // 출력 > 순서도 없고 중복값도 없다.
        System.out.println(strSet1);

//        for (String elem : strSet1){
//            System.out.println(elem);
//        }

        // Set에선 에초에 순서가 없기에 즉 인덱스가 없기에 get을 사용할 수 없다.
//        for (int i = 0; i < strSet1.size(); i ++){
//            System.out.println(strSet1.get(i));
//        }
        
        // 사용법 : 특정 element 추출 > List로 형변환
        strList1.addAll(strSet1);   // strList1에 strSet1의 모든 element들을 더한다는 의미
        strList1.addAll(strSet1);   // 리스트는 중복을 허용하므로 한 번더 더해도 중복된 값이 들어가 있다.
        for (int i = 0 ; i < strList1.size(); i++){
            System.out.print(strList1.get(i) + " ");
        }

        System.out.println("\n---------------");
        // Set은 순서가 없으니깐 , .sort()는 의미 없지만 List는 의미가 있다
        Collections.sort(strList1);
        System.out.println(strList1);

        // 역순정렬
        Collections.sort(strList1,Comparator.reverseOrder());
        System.out.println(strList1);

        // 새로운 Set을 선언해서 다시 strList1에 있는 부분을 더해버리면 중복이 제거
        Set<String> strSet2 = new HashSet<>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);
    }
}
