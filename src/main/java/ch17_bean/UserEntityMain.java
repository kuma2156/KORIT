package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();
        userEntity1.setUsername(1);
        userEntity1.setPassword(9876);
        userEntity1.setEmail("a@test.com");
        userEntity1.setName("김명규");

        System.out.println(userEntity1.toString());

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(5525);
        user2.setEmail("ssw@naver.com");
        user2.setName("조은별");
        System.out.println(user2);
    }
}
