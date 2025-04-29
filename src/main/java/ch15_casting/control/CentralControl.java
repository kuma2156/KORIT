package ch15_casting.control;
// LED 클래스 / Mouse 클래스 생성
// 메서드 구현부를 완성
public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    
    public void addDevice(Power device){
        // 왜 매게 변수가 자료형이 Power인지 고민해보자
        // Computer / LED / Mouse에 해당하는 객체들을 신경쓰지 않고 넣기 위해
        // 어차피 암시적으로 업캐스팅 되니깐
        int emptyIndex = checkEmpty();
        // 명확한 설계 하에 작성하게 된다면 이런 일이 발생하지 않지만
        // 자주 일어나는 현상이여서 적어둠
        if (emptyIndex == -1){  // checkEmpty() 메서드의 결과가 -1이라면
                                // 비어있지 않다는 의미
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
            객체명.getClass() 는 @주소지가 날라감
            객체명.getSimpleName() 는 패키지명 날라감
            객체명.getClass().getSimpleName() >> 메서드 체이닝이라고 한다.
        * */
    }
    private int checkEmpty(){ // 비어있는 배열의 index number를 반환하기 위한 method 1개 사용
        // 배열을 반복문을 돌려가지고 null값 빠져나오는 애들 return 하면 됌
        // 이상의 경우 굳이 정신나간 방법으로 코딩하지 않는 이상 가장 빨리 만나게 되는 null의
        // index number가 반환
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                return i;
            }
        }
        return -1;
        /*
            java에서 index 넘버에는 음수값이 없기 때문에 (근데 파이썬에는 마이너스 인덱스가 존재)
            실패를 나타낼 때 -1을 쓰는 경우가 많다
            근데 0과 너무 가까운 수다보니간 -100을 먹인다던데 혹은 return 값으로 나올 수 없을 만한
            음수를 지정하는 경우도 있는데
            나중에 addDevice() 메서드에 if(checkEmpty == -1231232)로 쓰고 싶지만
            -1을 쓰는것이 정신건강에 좋다
        * */
    }

    public void powerUp(){
        // deviceArray 배열 내에 있는 각 element 들은 Power 서브 클래스의 인스턴스에 해당
        // 그러면 .on() / .off() 전부 가지고 있을거고, instanceof 사용할 필요 없다
        for (Power device : deviceArray){
            if(device == null){
                System.out.println("장치가 들록되지 않은 슬롯입니다.");
                continue;   // 메서드가 종료되는게 아니라 다음 반복으로 넘어가는 키워드
            }
            device.on();
        }
    }

    public void powerOff(){
        // 일반 for 문으로 각 배열을 돌면서 .off() 시켜주세요
        // main에서 호출하면 됌 null 일 경우 장치가 등록되지 않은 슬롯입니다 출력
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                System.out.println("장치가 등록되지 않은 슬롯입니다");
                continue;
            }
            deviceArray[i].off();
        }
    }
}
