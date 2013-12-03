package com.thoughtworks.cloveryu.functional.domain;

import java.util.List;

public class Roster {

    public int countPersonsOlderThan(List<Person> roster, int age) {
        int counter = 0;
        for (Person person : roster) {
            if (person.getAge() >= age) {
                person.printPerson();
                counter++;
            }
        }
        return counter;
    }

    public int countPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        int counter = 0;
        for (Person person : roster) {
            if (low <= person.getAge() && person.getAge() < high) {
                person.printPerson();
                counter++;
            }
        }
        return counter;
    }

}
