package Exercices.Threads.ex_5;

public class Task implements Runnable{
    private Compteur compteur ;

    public Task (Compteur compteur){
        this.compteur = compteur;
    }
    @Override
    public  void run (){
        for (int i = 1 ; i<= 100 ;i++){
            compteur.inc();
        }
        try{
            Thread.sleep(10);

        }catch (InterruptedException e){
            System.out.println("fiiii9 asahbu ");
        }
    }
}
