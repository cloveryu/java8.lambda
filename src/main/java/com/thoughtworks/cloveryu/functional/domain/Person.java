package com.thoughtworks.cloveryu.functional.domain;

import java.time.LocalDate;

public class Person {

    public enum Gender {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private LocalDate birthday;
    private Gender gender;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void printPerson() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=").append(name).append(";").
                append("age=").append(age).append(";").
                append("birthday=").append(birthday).append(";").
                append("gender=").append(gender).append(";").
                append("email=").append(email);
        System.out.println(sb.toString());
    }

}
