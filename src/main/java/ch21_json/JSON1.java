package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject = new JsonObject();
        // 속성(key - value entry)를 추가하는 메서드 >> addProperty() 사용
        jsonObject.addProperty("username",1);
        jsonObject.addProperty("password",1234);
        jsonObject.addProperty("email","aa@test.com");
        jsonObject.addProperty("name","메타몽");

        // 출력
        System.out.println(jsonObject);
        /*
             {"username":1,"password":1234,"email":"aa@test.com","name":"메타몽"}
             이상의 콘솔창에서 결과값을 Java Map과 비교해보자면
             1. Map에는 Key 부분에 "" 가 없고
                 JSON 에서는 모든 Key가 String 처럼 보이도록 "" 가 있었다
             2. Map 에서는 key1 = value1 의 형태로 작성되었지만
                 JSON 에서는 "key1":value1 의 형태로 되어있다

        * */

        jsonObject.addProperty("job","코리아아이티아카데미학생");
//        System.out.println(jsonObject);

        /*
            콘솔에 출력된 값을 확인해보면 한 줄로 길게 늘어져 있습니다
            addProperty() 를 통해 키 값 쌍을 늘릴수록 계속 길어져서 가독성이 해치게 된다
            이 때 사용하는것이 GSON 이다
        * */

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // method chaining 개념
        String json = gson.toJson(jsonObject);
        System.out.println(json);
    }
}
