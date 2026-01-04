package Exercices.Serialization_And_Introspection;

import java.io.Serializable;

public class Person implements Serializable {
    
	private String name ;
    protected int age ;
    private String CEN ;
    transient String password ;

    public Person (String nom , int age , String CEN , String password){
        this.name = nom ;
        this.age = age ;
        this.CEN = CEN ;
        this.password = password ;
    }

    

	public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCEN() {
        return CEN;
    }

    public void setCEN(String CEN) {
        this.CEN = CEN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + name + '\'' +
                ", age=" + age +
                ", CEN='" + CEN + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}