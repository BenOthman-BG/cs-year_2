package Jfram.Threads_;


public class TestThread {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                    System.out.println("saha le lion allohma la hasad");
                }

                System.out.println("ceci est le thread t1");
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println("ceci est le thread t2");
            }

        });

        t1.setName("t1");

        t1.start();
        t1.interrupt();
        t1.join();
        t2.start();

        System.out.println(t1.getId() + " " + t1.getName() + " " + t1.getPriority());

    }

}