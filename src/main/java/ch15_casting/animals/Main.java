package ch15_casting.animals;

public class Main {

    public static void main(String[] args) {
        // 객체 생성
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        // 업캐스팅
        Animal animal1 = new Dog();     // 방법 # 1 A a = new B(); 형태
        // >>> 시험에서 자주 나옴!!!
        animal1.makeSound();        // makeSound() 만 사용가능해서 Animal 형태인줄 알았는데
                                    // Dog 클래스의 makeSound() 출력되는 결과가 생긴다
        Animal animal2 = dog1;      // 위에 생성한 dog1 객체를 대입
        animal2.makeSound();
//        animal2.fetch();          // 오류 발생
//        dog1.fetch();

        // instanceof 연산자 사용 예시
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);
        // instanceof 의 결과값이 true : 확인하고자 하는 object가 해당 클래스의 인스턴스이거나
        //                              하위 클래스의 인스턴스 일때 나온다.
        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);
        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);

        System.out.println("animal2 는 anima1과 사실상 같다");
        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);        // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);        // false

        System.out.println("위의 관련 코드들은 업캐스팅 관련 수업" );
        System.out.println("아래는 이제 다운캐스팅 수업");
        /*
            업캐스팅의 경우에는 암시적으로 이루어집니다. 그래서 A a= new B() 보고 대충 업캐스팅됐구나
            생각하는 반면
            (클래스명)객체명; 과 같이 다운캐스팅은 명시적으로 이루어져야 합니다
            > (int)2.3; 과 같은 방식으로
        * */
//        animal2.fetch(); >> 오류 발생
        Dog dog2 = (Dog)animal2; // 다운캐스팅
        dog2.makeSound();
        dog2.fetch();
        animal2.makeSound();
        ((Dog) animal2).fetch();  // 자동완성으로 되는 모습 즉, 다운캐스팅을 하면 자동완성으로 된다

//        Dog dog3 = (Dog) animal3; // animal3을 만들때 new Animal()로 만들었기에 다운캐스팅 불가능
//        dog3.makeSound();   // 에러 발생
        /*
            위의 코드를 실행하면 오류가 발생한다
            이유 :
                애초에 animal3을 생성할때  new Animal() 로 생성했기 때문에 다운캐스팅이 불가능하다
                즉 다운캐스팅의 전제 조건은:
                    A a = new B(); 에서 출발한다는 점을 확인할 수 있다.

             그래서 지금 경우의 수가 animal**이라는 객체가 있을 때 걔가 Animal() 생성자로 생성됐는지
             Dog() 생성자로 생성됐는지에 따라 우리 프로그램이 오류가 날 수도 있고 안 날 수도 있다.

        */

        Animal animal4 = new Dog();
        System.out.println("animal4 검증 파트");
        if(animal4 instanceof Dog){
            Dog dog4 = (Dog) animal4;

            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("animal3 검증 파트");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;
            dog3.makeSound();
            dog3.fetch();
        }else{
            System.out.println("불가능한 다운캐스팅입니다.");
        }
    }
}
