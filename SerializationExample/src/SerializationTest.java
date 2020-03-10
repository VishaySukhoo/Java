
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vishay
 */
public class SerializationTest {

    static String fileName = "SerializedObjects.txt";

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        //Single Object
        System.out.println("Single Object Serialization");

        Person object = new Person();
        object.setAge(1);
        object.setName("p1");
        object.setHeight(4);

        PersonSubclass ps = new PersonSubclass();
        ps.setProperty1("Hi");
        ps.setProperty2(4);
        ps.setPropertyguid(12145);

        object.setPersonSubclass(ps);

        Serialize(object);

        Person object1 = null;
        object1 = (Person) Deserialize();
        out.println("Age " + object1.getAge());
        out.println("Name " + object1.getName());
        out.println("Height " + object1.getHeight());
        out.println("PersonSubclass Property1 " + object1.getPersonSubclass().getProperty1());
        out.println("PersonSubclass Property2 " + object1.getPersonSubclass().getProperty2());
        out.println("PersonSubclass Propertyguid " + object1.getPersonSubclass().getPropertyguid());

        //list of objects
        System.out.println("Serialize list of objects");

        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person personObj = new Person();
            personObj.setAge(2);
            personObj.setPersonSubclass(new PersonSubclass());
            personObj.getPersonSubclass().setProperty1("Word");
            list.add(personObj);

        }

        Serialize(list);

        //Deserialize
        list = null;
        list = (ArrayList) Deserialize();
        for (int x = 0; x < 10; x++) {
            Person p1 = list.get(x);
            out.println("Age " + p1.getAge());
            out.println("Name " + p1.getName());
            out.println("Height " + p1.getHeight());
            out.println("PersonSubclass Property1 " + p1.getPersonSubclass().getProperty1());
            out.println("PersonSubclass Property2 " + p1.getPersonSubclass().getProperty2());
            out.println("PersonSubclass Propertyguid " + p1.getPersonSubclass().getPropertyguid());

        }
    }

    public static void Serialize(Object dataObject) throws FileNotFoundException, IOException {
        try (FileOutputStream file = new FileOutputStream(fileName); ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(dataObject);
            System.out.println("Object has been serialized");
        }
    }

    public static Object Deserialize() throws IOException, FileNotFoundException, ClassNotFoundException {
        Object object = null;
        try (FileInputStream file = new FileInputStream(fileName); ObjectInputStream in = new ObjectInputStream(file)) {
            object = in.readObject();
            System.out.println("Object has been deserialized");
        }
        return object;
    }

}
