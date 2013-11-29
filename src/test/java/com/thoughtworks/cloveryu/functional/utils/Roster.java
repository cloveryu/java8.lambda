package com.thoughtworks.cloveryu.functional.utils;

import com.thoughtworks.cloveryu.functional.domain.Person;

import java.util.List;

public class Roster {

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person person : roster) {
            if (person.getAge() >= age) {
                person.printPerson();
            }
        }
    }

}
