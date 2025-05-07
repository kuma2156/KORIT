package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Setter
@Data
@AllArgsConstructor
class User{
    private String userName;
    private String password;
    private String email;
    private String age;
    private String name;


}

public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 사용할 변수 선언
        String userJson = null;
        
        // 1. Java Object > JSON 으로 변환
        // user1 객체를 생성하고 "닉네임", "패스워드"... 입력
        User user1 = new User("ddingyu","1234","kuma2156@naver.com","27","김명규");
        // 그럼 생성된 user1 인스턴스를 가지고 Json 데이터로 변환
        userJson =gson.toJson(user1);
        System.out.println("gson의 결과값 : "+ userJson);

        userJson = gsonBuilder.toJson(user1);
        System.out.println("gsonBuilder의 결과값 : "+ userJson);

        // 2. JsonObject > json 으로 변환 JSON1에 했던것
        // studentCode studentName studentYear score 객체 생성
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode",2025001);
        jsonObject.addProperty("studentName","김이");
        jsonObject.addProperty("studentYear",2);
        jsonObject.addProperty("score",96.7);

        String studentJson;
        studentJson = gson.toJson(jsonObject);
        System.out.println("JsonObject 결과 값 : " + studentJson);

        studentJson = gsonBuilder.toJson(jsonObject);
        System.out.println("JsonBuilder 결과 값 : " + studentJson);


        System.out.println("-------------------------");
        // 3. Map > Json 데이터로
        /*
            Map을 활용해서 key String / value String 으로 선언하고 객체명을 map1

            빈 맵 생성

            map에 productCode NT960XMA-KD726
            productName 삼성 갤럭시북 프로5
            라는 Entry 입력하시오
        * */

        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode","NT960XMA-KD726");
        map1.put("productName","삼성 갤럭시북 프로5");

        System.out.println(map1.toString());;
        String mapJson = gson.toJson(map1);
        System.out.println("Map gson 의 결과 값 : " + mapJson);
        mapJson = gsonBuilder.toJson(map1);
        System.out.println("Map gsonBuilder 의 결과 값 : " + mapJson);

        // 그렇다면 Json > Map / Java 객체 자료형으로 바꿀려면 어떡해야할까
        // 즉 json 데이터를 user 객체로 다시 바꾸는 것과
        // json 데이터를 map2 형태로 작성하는 것을 의미한다
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는_클래스형태);

        // json > map
        String productJson = gsonBuilder.toJson(map1);
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);

        // json > user 클래스의 인스턴스로 바꾸는 방법
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println("json > user : " + user2);

        // json > jsonObject 이게 의미하는 바는 json data =/= jsonObject 이다
        // studentJson  자료형은 String 이고 jsonObject 자료형은 jsonObject 이니
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
    }
}
