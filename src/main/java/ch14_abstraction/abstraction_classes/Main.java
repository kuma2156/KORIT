package ch14_abstraction.abstraction_classes;

public class Main {
    public static void main(String[] args) {
//        // PhoneFactory 객체 생성
//        PhoneFactory phoneFactory1 = new PhoneFactory();
//        phoneFactory1.setName("애플 스마트폰 공장");        // 부모 메서드 사용
//        phoneFactory1.produce("아이폰17");          // 추상 메서드 사용 # 1
//        phoneFactory1.manage();                          // 추상 메서드 사용 # 2
//        phoneFactory1.displayInfo();                     // 부모 메서드 사용
//
//        // 익명 클래스
//        Factory factor1 = new Factory(){
//
//            @Override
//            public void produce(String model) {
//                System.out.println(this.getName() +"에서 [ " + model + " ]을 생산합니다.");
//            }
//
//            @Override
//            public void manage() {
//                System.out.println("가전 제품을 공장을 관리합니다.");
//            }
//        }; // 추상메서드를 main 단계에서 구현. 그리고 객체 생성을 한 상태라고 할 수 있다.
//        // 그렇다면 알반적인 클래스를 기준으로 봤을 때 메서드를 정의한 부분까지 작성했다고 볼 수 있겠다.
//        factor1.setName("가전 제품 공장");
//        factor1.produce("백색 가전");
//        factor1.displayInfo();
        
        /*
            이상의 개념은 추상 크랠스의 개념에서 벗어납니다(객체 생성이 불가능하다고 했는데 Factory 클래스의 객체가 생성되었다는 점에서)
            Java17인지 11인지 도입된 익명 클래스라는 개념인데
            재사용하지 않고 한 번만 쓰고 버릴거라면(즉, 이 Main 클래스에서만 사용하고 다른 클래스에서는 사용하지 않을거라면), 사용하기에 좋다
        * */

//        PhoneFactory phoneFactory2 = new PhoneFactory();
//        phoneFactory2.setName("삼성 스마트폰 공장");
//        phoneFactory2.produce("갤럭시S 26");

        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setName("애플 태블릿 공장");
        tabletFactory1.produce("아이패드 미니 6세대");
        tabletFactory1.manage();
        tabletFactory1.upgrade("아이패드 미니 7세대");

        // interfaces
    }
}
