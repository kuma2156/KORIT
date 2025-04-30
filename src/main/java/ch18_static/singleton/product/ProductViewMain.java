package ch18_static.singleton.product;

public class ProductViewMain {
    public static void main(String[] args) {
//        ProductView productView1 = new ProductView();
//        ProductView productView2 = new ProductView();  // 생성자에 private 선언 후에는 오류 발생

        // 생성자를 private 처리를 했고, getInstance() 메서드 내에서 instance 정적 변수가 null 이라면
        // instance = getInstance); 를 통해 객체를 생성합니다.
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        /*
            결과는 단 한번의 객체만 생성되는 걸 확인할 수 있다
            ProductView.getInstance(); 의 결과값은 동일한 instance입니다
            그렇다면 실제 생성된 객체의 수는 1 개
            그리고 그 한개를 다른 객체 이름에 대입했을 뿐입니다.

            그래서 콘솔의 출력 결과를 보면
            1 번 째 객체가 생성되었습니다.
            1 번 째 객체가 생성되었습니다.
            1 번 째 객체가 생성되었습니다.
            1 번 째 객체가 생성되었습니다.
            가 아니라.
            1 번 째 객체가 생성되었습니다.
            로 출력되는 것을 확인 할 수 있다.
        * */
        productView1.showMainView();
        productView3.showOrderView();
    }
}
