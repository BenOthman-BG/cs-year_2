package semain_prepa.Threads;

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
