package ch19_generic;

import javax.xml.crypto.Data;
import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date(); // Java 내장 클래스로 객체 생성
        
        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공 : ",now.toString());
        // 근데 <int> 에서 T가 클래스이기 때문에 기본 자료형은 못들어간다
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장 성공 : ", 34  );
        ResponseData<Date> responseData3 = new ResponseData<>("날씨 객체 저장 성공 : ", now);

        System.out.println(responseData1);
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
