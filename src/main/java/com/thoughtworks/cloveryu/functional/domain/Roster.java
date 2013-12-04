package com.thoughtworks.cloveryu.functional.domain;

import java.util.List;
import java.util.function.Predicate;

public class Roster {

    private int counter;

    private int getCounter() {
        return this.counter;
    }

    private void increaseCounter() {
        this.counter++;
    }

    private void resetCounter() {
        this.counter = 0;
    }

    public int countPersonsOlderThan(List<Person> roster, int age) {
        resetCounter();
        for (Person person : roster) {
            if (person.getAge() >= age) {
                increaseCounter();
            }
        }
        return getCounter();
    }

    public int countPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        resetCounter();
        for (Person person : roster) {
            if (low <= person.getAge() && person.getAge() < high) {
                increaseCounter();
            }
        }
        return getCounter();
    }

    public int countPersonsWithChecker(List<Person> roster, CheckPerson tester) {
        resetCounter();
        for (Person person : roster) {
            if (tester.test(person)) {
                increaseCounter();
            }
        }
        return getCounter();
    }

    public int countPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        resetCounter();
        for (Person person : roster) {
            if (tester.test(person)) {
                increaseCounter();
            }
        }
        return getCounter();
    }

}
