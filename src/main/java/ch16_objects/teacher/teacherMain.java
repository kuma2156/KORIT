package ch16_objects.teacher;

import ch16_objects.Teacher;

public class teacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김명규","신라대");
        Teacher teacher2 = new Teacher("김명규","신라대");
        
        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2);
        
        /*
            .equals()의 경우 주소지가 아니라 속성값이 서로 일치하는지 확인
            == 의 경우에는 주소지까지 같은지 확인
        * */

        String name = "김명규";
        boolean result3 = name.equals("김명규");
        System.out.println(result3);    // 결과값 :  true
        boolean result4 = name == "김명규";
        System.out.println(result4);

        String name2= new String("김명규");
        boolean result5 = name.equals(name2);
        System.out.println(result5);
        boolean result6 = name == name2;
        System.out.println(result6);
        /*
            .equals의 결과값 =/= == 의 결과값

        * */

        String[] strArray = {"안녕하세요","안녕하세요"};
        System.out.println(strArray[0].equals(strArray[1]));
    }
}
