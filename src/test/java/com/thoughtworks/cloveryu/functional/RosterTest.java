package com.thoughtworks.cloveryu.functional;

import com.thoughtworks.cloveryu.functional.domain.CheckPerson;
import com.thoughtworks.cloveryu.functional.domain.Person;
import com.thoughtworks.cloveryu.functional.domain.PersonBuilder;
import com.thoughtworks.cloveryu.functional.domain.Roster;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RosterTest {

    private List<Person> persons;
    private Roster roster;

    @Before
    public void setUp() {
        roster = new Roster();
        persons = new ArrayList<>();
        persons.add(new PersonBuilder().withName("clover").withAge(22).
                withGender(Person.Gender.MALE).withEmail("clover@g.com").build());
        persons.add(new PersonBuilder().withName("brent").withAge(23).
                withGender(Person.Gender.MALE).withEmail("brent@g.com").build());
        persons.add(new PersonBuilder().withName("alice").withAge(22).
                withGender(Person.Gender.FEMALE).withEmail("alice@g.com").build());
        persons.add(new PersonBuilder().withName("lucy").withAge(24).
                withGender(Person.Gender.FEMALE).withEmail("lucy@g.com").build());
        persons.add(new PersonBuilder().withName("tom").withAge(26).
                withGender(Person.Gender.MALE).withEmail("tom@g.com").build());
    }

    @Test
    public void shouldPrintPersonAgeOlderThan23() {
        assertThat(roster.countPersonsOlderThan(persons, 23), is(3));
    }

    @Test
    public void shouldPrintPersonAgeInRange() {
        assertThat(roster.countPersonsWithinAgeRange(persons, 23, 25), is(2));
    }

    @Test
    public void shouldPrintPersonIfMaleAndAgeInRange20And24() {
        assertThat(roster.countPersonsWithChecker(persons, new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.Gender.MALE &&
                        20 <= person.getAge() && person.getAge() <= 24;
            }
        }), is(2));
    }

    @Test
    public void shouldPrintPersonWithLambdaIfMaleAndAgeInRange20And24() {
        assertThat(roster.countPersonsWithChecker(persons,
                (Person p) -> p.getGender() == Person.Gender.MALE &&
                        20 <= p.getAge() && p.getAge() <= 24), is(2));
    }

    @Test
    public void shouldPrintPersonWithPredicateIfMaleAndAgeInRange20And24() {
        assertThat(roster.countPersonsWithPredicate(persons,
                p -> p.getGender() == Person.Gender.MALE &&
                    20 <= p.getAge() && p.getAge() <= 24), is(2));
    }

}
