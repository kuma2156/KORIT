package ch16_objects;
/*
    필드 전부 private 로 선언
    String name
    String address
    
    기본생성자, 매게변수 생성자(1개 , 2개)
        ex) 기본 생성자가 생성되었습니다
            name 매게변수로 객체가 생성되었습니다
            name, address 매게변수로 객체가 생성되었습니다
     
     getter / setter 정의
     
     displayInfo() 메서드를 call1() 유형으로 정의
         ex)
            이름 :
            주소 : 
            
     ObjectTestMain에서 객체를 생성하고 이름 주소를 입력하고 displayInfo() 실행
* */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자가 생성되었습니다.");
    }

    public ObjectTest(String name) {
        System.out.println("name 매게변수로 객체가 생성되었습니다");
        this.name = name;
    }

    public ObjectTest(String name, String address) {
        System.out.println("name, address 매게변수로 객체가 생성되었습니다");
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void displayInfo(){
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

//    public void ObjectTest(String address){
//        this.address = address;
//    }
    /*
        이상의 코드가 오류가 발생하는 이유
        필드의 name 과 address 가 둘 다 자료형이 String이기 때문에 컴퓨터는 이걸 인식을 못하기에
        오류가 발생한다

        ObjectTest objectest1 = new ObjectTest("김명규"); << 사람들은 이게 이름인지 알지만 컴퓨터는 그걸 인식을 못함
    * */

    // Object 클래스를 override

    @Override
    public String toString() {
        return "이름 : " + name + '\n' + "주소 : " + address;
    }


}
