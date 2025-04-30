package ch18_static.singleton.product;

public class ProductView {
    // 정적 변수 선언 > 자료형 ProductView 변수명이 instance
    // 보통 싱글톤 패턴을 생성할 때 정적 변수 이름이 instance > 시험 중 힌트 하나
    private static ProductView instance;

    // 일반적인 생성자 작성 방식과 차이점이 여기서 부터 발생합니다
    private ProductView() {
        int counter = 1;    // 클래스 필드를 선언하지 않았는데 이렇게도 가능 지역변수
        System.out.println(counter + " 번 째 객체가 생성되었습니다");
        
    }
    
    // 정적 메서드를 정의 > 싱글톤에서 대부분의 경우 메서드명 getInstance() > 시험 시에 힌트
    public static ProductView getInstance(){
        if(instance == null){               // 현재 인스턴스가 없다면 해당 조건문을 실행
            instance = new ProductView();   // ProductView의 객체가 생성되고
        }                                   // 그 객체를 정적 변수인 instance에 대입
        return instance;                    // 최초 생성된 객체가 계속 return 됨
    }

    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인화면");
    }
    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}
