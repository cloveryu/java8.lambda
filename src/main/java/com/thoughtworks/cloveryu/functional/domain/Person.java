package com.thoughtworks.cloveryu.functional.domain;

public class Person {

    public enum Gender {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private Gender gender;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printPerson() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=").append(name).append(";").
                append("age=").append(age).append(";").
                append("gender=").append(gender).append(";").
                append("email=").append(email);
        System.out.println(sb.toString());
    }

}
