package kz.org.spring.models;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


public class Person {
    private  int id;

    @NotEmpty(message = "Name ne dolzhen bit pustim")
    @Size(min = 2, max = 30, message = "Name ot 2 do 30 simvolov")
    private String name;

    @Min(value = 0, message = "min 0")
    private int age;

    @NotEmpty(message = "mail ne dolzhen bit pustim")
    @Email(message = "emal dolzhen bit validnim")
    private String email;
    public Person() {
    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
