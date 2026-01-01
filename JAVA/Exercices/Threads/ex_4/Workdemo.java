package Jfram.Threads_;

import com.sun.source.util.TaskEvent;

public class Workdemo {
    public static void main(String[] args){
        Bni sharedTask = new Bni();
        Thread w1 = new Thread(() -> sharedTask.doWork("worker-1"));
        Thread w2 = new Thread(() -> sharedTask.doWork("worker-2"));
        Thread w3 = new Thread(() -> sharedTask.doWork("worker-3"));
        Thread w4 = new Thread(() -> sharedTask.doWork("worker-4"));

        w1.start();
        w1.interrupt();
        w2.start();
        w3.start();
        w4.start();
    }


}
