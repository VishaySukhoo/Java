
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vishay
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    transient int height; // will not serialize this object
    private PersonSubclass personSubclass;

    public PersonSubclass getPersonSubclass() {
        return personSubclass;
    }

    public void setPersonSubclass(PersonSubclass personSubclass) {
        this.personSubclass = personSubclass;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
