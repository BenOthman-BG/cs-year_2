package Jfram.Threads_;

class Bni{
    private int step = 1 ;
    public synchronized void doWork(String name) {
        for (int i = 0 ; i <5 ; i++){
            int current = step;
            System.out.println(name + "read step = "+current);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("wlah ma3reft ");
                break;
            }
            step = current+1;
            System.out.println(name +"updated step to "+step);
        }
    }
}


