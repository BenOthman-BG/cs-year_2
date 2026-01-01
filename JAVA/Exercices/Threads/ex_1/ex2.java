package Jfram.testExam;

public class ex2 {
    public static void main(String[] args)  throws  InterruptedException{

        Counter increment = new Counter();

        Runnable Mytask = new Runnable() {
            @Override
            public  void  run() {
                for (int i = 0 ; i<100 ; i++){
                     increment.increment();
                     try{
                         Thread.sleep(20);
                     }catch (InterruptedException e){
                         System.out.println("stop sleeping");
                     }
                }
            }
        };

        Thread t1 = new Thread(Mytask , "t1") ;
        Thread t2 = new Thread(Mytask , "t2");


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(increment.getValue());



    }
}
