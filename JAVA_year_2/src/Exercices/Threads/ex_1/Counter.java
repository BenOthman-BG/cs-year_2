package Exercices.Threads.ex_1;

public class Counter {
    private int value =0 ;

    public synchronized void  increment (){
        value++ ;
    }

    public int getValue(){
        return value;
    }
}