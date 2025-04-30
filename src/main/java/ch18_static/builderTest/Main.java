package ch18_static.builderTest;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new GameCharacter.Builder()
                .name("오뒷세우스")
                .job("전사")
                .level(96)
                .addskill("드래곤 로어")
                .addskill("배쉬")
                .build();

        System.out.println(warrior.toString());
    }
}
