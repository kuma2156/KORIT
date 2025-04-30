package ch18_static.builderTest;

import ch18_static.builders.Person;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private String name;
    private String job;
    private int level = 1;
    private List<String> skill;

    private GameCharacter(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.level = builder.level;
        this.skill = builder.skill;

    }

    public static class Builder {
        private String name;
        private String job;
        private int level = 1;
        private List<String> skill = new ArrayList<>();

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder job(String job){
            this.job = job;
            return this;
        }
        public Builder level(int level){
            this.level = level;
            return this;
        }
        public Builder addskill(String skill){
            this.skill.add(skill);
            return this;
        }

        public GameCharacter build(){
            return new GameCharacter(this);
        }
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", level=" + level +
                ", skill=" + skill +
                '}';
    }
}
