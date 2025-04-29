package ch14_abstraction.abstraction_classes;
/*
    지시 사항
    1. Factory 클래스 상속
    2. 그러면 오류 나오는 거 처리
    3. TabletFactory method인 upgrade(String model) call2 유형으로 정의
        객체명.upgrade("아이패드 프로 13인치 8세대")로 호출
            아이패드 프로 13인치 8세대로 업그레이드합니다. 출력
     
    4. produce() , manage() 적절히 수정       
    5. Main으로 이동해서
        tabletFactory1 객체 생성  > 애플 태블릿 공장으로 이름 짓기
    6. produce() 호출
    7. manage() 호출
    8. upgrade("아이패드 미니 7세대") 호출
* */
public class TabletFactory extends Factory {

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블랫을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    public void upgrade(String model){
        System.out.println(model +"로 업그레이드합니다.");
    }
    
}
