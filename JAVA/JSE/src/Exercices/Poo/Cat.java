package Exercices.Poo;

public class Cat extends Animal{
    public Cat (String name , int age){
        super(name, age);
    }

    @Override
    public void MakeSound (){
        System.out.println("miyawooooooo");
    }
}
