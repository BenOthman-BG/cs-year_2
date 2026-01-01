package Jfram.Threads_;

public class testMymetho {
    public static void main(String[] args) throws InterruptedException{
        Runnable work1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 5 ; i++){
                    System.out.println("step "+i);
                    try {
                        Thread.sleep(200);
                    }catch (InterruptedException e ){
                        System.out.println("faa9 ");
                    }
                }
            }
        };

        Thread t1 = new Thread(work1);
        Thread t2 = new Thread(work1);

        t1.start();
        t2.start();
        Thread.sleep(200);
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();

    }

}
