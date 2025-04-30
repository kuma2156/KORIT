package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok personLombok1 = PersonLombok.builder()
                .name("띵규")
                .address("부산")
                .age(25)
                .build();
        System.out.println(personLombok1.toString());
    }

}
