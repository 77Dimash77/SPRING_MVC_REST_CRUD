package kz.org.spring.dao;

import kz.org.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLECOUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLECOUNT,"Tom"));
        people.add(new Person(++PEOPLECOUNT,"Jerry"));
        people.add(new Person(++PEOPLECOUNT,"Ushlep"));
        people.add(new Person(++PEOPLECOUNT,"LOL"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
    return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
    public void save(Person person){
        person.setId(++PEOPLECOUNT);
        people.add(person);
    }
}
