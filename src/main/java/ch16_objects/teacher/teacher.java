package ch16_objects.teacher;

import java.util.Objects;

public class teacher {
    private String name;
    public String schoolName;

    public teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name + "선생님의 근무지는 "+ schoolName + "학교 입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        teacher teacher = (teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }
    // 객체명1.equals(객체명2)
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
