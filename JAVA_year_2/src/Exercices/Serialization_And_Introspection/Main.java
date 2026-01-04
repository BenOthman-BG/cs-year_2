package Exercices.Serialization_And_Introspection;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person ("othman", 18, "X45007", "othman123");
        saveObject(p1 , "oth.txt");


        Person p2 = Pes_Object("oth.txt");
        System.out.println(p2);
    }

    public static void saveObject(Person p, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(p);
            System.out.println("seccefuly ...");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Person Pes_Object(String filname) {
        try (ObjectInputStream oop = new ObjectInputStream((new FileInputStream(filname)))) {
            return (Person) oop.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
