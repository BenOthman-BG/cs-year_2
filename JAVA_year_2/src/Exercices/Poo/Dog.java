package Exercices.Poo;

public class Dog extends Animal{
    public Dog (String name , int age){
        super(name,age);
    }

    @Override
    public void MakeSound(){
        System.out.println("how how how how how");
    }
}
