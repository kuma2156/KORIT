package ch24_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Stream API 주요 메서드 예제
public class StreamApiExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영","김일","김이","김삼","김사","박수");

        // filter()
        List<String> namesWithKim = names.stream().filter(name -> name.startsWith("김")).toList();
        // filter() 를 자체로 한 방에 쓰이기 보다는 합쳐서 쓴다.
        // filter / map / sorted /collect
        List<String> engListNames = Arrays.asList("alice","alex","metamon","nana","camel","yor");
        List<String> result = engListNames.stream()
                // 여기 사이에 다양한 메서드를 쓰라는 의미 (마치 builder 패턴을 사용한거랑 비슷)
                .filter(name -> name.startsWith("a")) // a 로 시작하는 element 추출
                .map(String::toUpperCase)                   // 이상의 결과값으로 a 로 시작하는 걸 뽑았는데. 대문자로 변환
                .sorted()
                .toList();

        System.out.println(engListNames);
        System.out.println(result);
//        System.out.println(names);
//        System.out.println(namesWithKim);

        // count()
        int count1 = engListNames.size();       // element 의 전체 개수를 세는 것만 가능
        System.out.println(count1);

        long count2 = engListNames.stream().filter(name -> name.length() > 3).count();
        System.out.println(count2);

        int count3 = 0;
        // 만약에 기존 방식으로 작성한다면
        for (int i = 0 ; i < engListNames.size(); i++){
            if(engListNames.get(i).length() > 3){
                count3++;
            }
        }
        System.out.println(count3);
    }
}
