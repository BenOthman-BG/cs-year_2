package Exercices.Threads.ex_5;

public class Compteur {
    private int value = 0 ;

    public Compteur(){};
    public int getValue(){
        return value ;
    }
    public synchronized void inc (){
        value++ ;
    }
}
