package com.thoughtworks.cloveryu.functional.domain;

public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public Person build() {
        return person;
    }

    public PersonBuilder withName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder withAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder withGender(Person.Gender gender) {
        person.setGender(gender);
        return this;
    }

    public PersonBuilder withEmail(String email) {
        person.setEmail(email);
        return this;
    }
}
