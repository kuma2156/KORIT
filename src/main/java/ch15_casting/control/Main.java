package ch15_casting.control;

public class Main {
    public static void main(String[] args) {
        // 객체들 생성
        Computer computer1= new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        CentralControl control1 = new CentralControl(new Power[5]);
        // 배열 생성 방법을 떠올려서 5개짜리 사이즈의 배열을 CentralControl() 생성자의
        // argument로 집어 넣기
//        CentralControl control2 = new CentralControl({computer1, led1, mouse1});
        // 이상의 코드가 오류가 나는 것을 확인했을 때
        // 생성자의 argument로 빈 배열을 집어넣는 것은 가능해보이지만 곧장 바로 넣는것은 실패
        
        // 메인에서 확인결과 element 가 있는 배열을 집어넣지 못했으니깐
        // Power의 자식 클래스의 인스턴스를 집어넣는 메서드 정의
        Power[] powers = {computer1, led1, mouse1};
        CentralControl control2 = new CentralControl(powers);
        // 빈 배열을 집어넣는 것만 가능한게 아니라, 미리 배열을 생성해놓고
        // 확인했을 때 이미 암시적 업캐스팅이 이루어져싿. 
        // control2 생성시에 집어넣는 방법이 가능하다
        // 다만 이상의 경우 구글홈 미니를 만들었는데 거기에 default로 
        // 컴퓨터, LED, 마우스가 한대씩 등록되어있다고 봐야하기 때문에
        // 저희는 control1기준으로 수업

        control1.addDevice(computer1);             // 여기서 0번 인덱스를 차지했기에
//        System.out.println(control1.checkEmpty()); // 결과값은 1이 나온다 확인하고 private로 변경하였다 checkEmpty() 메서드를

        control1.addDevice(led1);
        control1.addDevice(mouse1);

        control1.powerUp();
        control1.powerOff();
    }
}
