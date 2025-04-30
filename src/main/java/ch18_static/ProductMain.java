package ch18_static;

import ch08_methods.Method01;

import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) {
        Method01.call1();   // 다른 클래스에서 사용할려면 클래스명.메서드명() 호출
//        System.out.println(Arrays.toString());  // 이런식으 예전에 호출을 해본적이 있다.
        System.out.println(Product.getCount());   // 클래스명.메서드명() 을 통한 getter
        Product product1 = new Product();
        System.out.println("count : " + Product.getCount());
        System.out.println("instanceCount : " + product1.getInstanceCount());
        Product product2 = new Product();
        System.out.println("count : " + Product.getCount());    // 정적 메서드 호출
        System.out.println("instanceCount : " + product2.getInstanceCount());   // 일반 메서드 호출 1
        System.out.println("instanceCount : " + product2.getInstanceCount());   // 1

        // 결과적으로 인스턴스 변수는 객체에 종속되어 있기 때문에 객체 생성시에 0에서 1로 증가하는 것 밖에
        // 결과가 나오지 않지만,. 정적 변수인 count의 경우는 객체가 생성될 때 마다 count++ 가 적용되면
        //  객체의 수가 만큼 count가 갱신된다는 점을 확인할 수 있다.
        
        // 즉, 인스턴스 변수 > 객체에 종속 / 정적 변수 > 클래스에 종속
    }
}
