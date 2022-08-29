package ua.goit.jdbс.dto;

import java.sql.Date;

public class DevelopersDto {
    Integer id;
    String developerName;
    Integer age;
    String gender;
    String different;
    Integer salary;

    public DevelopersDto() {
    }

    public DevelopersDto(Integer id, String developerName, Integer age, String gender, String different, Integer salary) {
        this.id = id;
        this.developerName = developerName;
        this.age = age;
        this.gender = gender;
        this.different = different;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDifferent() {
        return different;
    }

    public void setDifferent(String different) {
        this.different = different;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
