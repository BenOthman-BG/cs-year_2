package Exercices.Threads.ex_5;

public class Main {
    public static void main(String[] args) throws  InterruptedException {


        Compteur c = new Compteur();

        Runnable r1 = new Task(c);
        Runnable r2 = new Task(c);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getValue());

    }
}
