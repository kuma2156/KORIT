package ch20_collections;

import java.util.*;

public class strMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        
        // Map에 Key - value 쌍 삽입 > .put(키, 값)
        strMap1.put("kor2025001","김명규");
        strMap1.put("kor2025002","김명뉴");
        strMap1.put("kor2025003","김명듀");
        strMap1.put("kor2025004","김명류");

        // map 출력
        System.out.println(strMap1);

        strMap1.put("kor2025004","조은별");
        System.out.println(strMap1);

        // Map의 특징 중 하나로 하나의 Key 에는 하나의 value 만 가능하다
        // 그래서 key 값이 동일하다면 value 값은 최신 것으로 덮어씌어진다.

        // List 의 경우에 특정 인덱스를 조회하고 싶다면
        // 리스트명.get(인덱스 넘버) 의 형태로 확인 할 수 있었다.
        // Map의 경우 순서가 없는 대신 key 가 있기 때문에
        // 특정 키의 값 조회
        System.out.println(strMap1.get("kor2025001"));
        // 이런 식으로 출력이 가능하다

        // Java > Map에서의 Key - value pair를 entry 라고 칭한다.

        // 특정 키 의 값 수정 # 1 > 덮어 씌우기
        strMap1.put("kor2025001","메타몽");
        System.out.println(strMap1.get("kor2025001"));

        // 특정 키의 값 수정 # 2 > .replace()
        strMap1.replace("kor2025002","고라파덕");
        System.out.println(strMap1.get("kor2025002"));

        // 특정 키의 존재 여부 > containKey() > boolean
        boolean searchKeyFlag1 = strMap1.containsKey("kor2025006");
        System.out.println("kor2025006 존재 여부 : " + searchKeyFlag1);

        // 특정 값 존재 여부 > containValue() > boolean
        boolean searchValueFlag2 = strMap1.containsValue("메타몽");
        System.out.println("메타몽 존재 여부 : " + searchValueFlag2);

        // Map 의 엔트리로 부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>(); // 비어있는 Set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet(); // Map의 element를 Set에 삽입
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println(entrySet1.size());
        System.out.println(entrySet2.size());   // 5개가 출력되는다는 점에서 `key value`가 하나의 element로 잡힘

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map<String, String>> entryList2 = strMap1.entrySet(); // Map > List 대입이 불가능하다는 예시
        // 결국 Map에서 List로 형변환하고 싶다면 Set을 경유해야한다
        entryList1.addAll(entrySet2);
        System.out.println(entryList1);

        // 그러면 sort()도 가능하다

        // key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
//        Set<String> valueSet = strMap1.values(); // 오류 발생 예시 > 필요한 타입 Set / 제공된 타입 Collection
        // 이상의 문제가 발생하는 이유는 Key는 중복을 허용하지 않기 때문에 Set으로 형변환이 가능한 반면
        // 복수의 Key에서 동일한 value가 존재할 수 있기에 Set으로 생성이 불가능하다.
        Collection<String> values = strMap1.values();
        System.out.println(values);
    }
}
