package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    // interfac이기 때문에 변수 앞에 접근 지정자를 몇시하지 않았지만
    /*
        public final에 해당하비낟. 또한 상수이기 때문에 상수명을 나타내는 NAME으로
        작성하였고. 일반 클래스의 field 선언처럼 String name; 으로 작성하는 것이 불가능하다.
        
        나중에 깃허브에 안되는 것을 나열합니다.
    * */
    
    // 안되는 것들
//    String name;
//    public Press(){};
//    void popOut(){
//        System.out.println("추상 메서드만 가능 / 일반 메서드는 불가능한 예시");
//    }

    // 되는 것
    void onPressed();      // 아무 표시 안했지만 abstract입니다.

}
