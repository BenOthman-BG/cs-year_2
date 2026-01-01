package TP_2eme_anne_1;

import java.util.Scanner;

public class tri_bulle {
    public static void main(String[] args) {
        System.out.println("Bonjour ce programme va de faire tri a bulle de t[n] :");
        Scanner reader = new Scanner(System.in);
        System.out.print("Entre la taille de tableau : ");
        int n = reader.nextInt();
        System.out.println("remplire le tableau");
        int i ;
        int[] T = new int[n];
        for (i = 0 ; i <n ; i++){
            System.out.print("T["+(i+1)+"] = ");
            T[i] = reader.nextInt();
        }
        for (i=0 ; i<n;i++){
            System.out.println(T[i]);
        }
        int tmp ;
        for (i = 0 ; i<n ; i++ ){
            for (int j = 0 ; j < n-1-i ; j++){
                if(T[j]> T[j+1]){
                    tmp = T[j];
                    T[j] = T[j+1];
                    T[j+1] = tmp;
                }
            }
        }




        System.out.println(" the sort : ");
        for (i=0 ; i<n;i++){
            System.out.println(T[i]);
        }

        int solution = dichotomie(T , 13);
        System.out.println("---------------");
        System.out.println(solution);





    }
    public static int dichotomie ( int[] tableau  , int nbr_s){

        int soulution = 0 ;
      int n = tableau.length;
      int debut = 0;
      int fin = n;
      int div = (debut + fin) / 2 ;
      int i ;
        if (n < 2 && tableau[0] == nbr_s){
            return soulution = nbr_s ;
        }else if(n < 2){
            return soulution;
        }

      if (nbr_s < tableau[div]){
          int[] T = new int[div+1];
          for (i = 0 ; i<= div ;i++){
              T[i] = tableau[i];
          }
          soulution = dichotomie(T ,nbr_s);
      }else if(nbr_s > tableau[div]){
          int[] T = new int[n-div];
          for (i = 0 ; i<n-div ; i++){
              T[i]  = tableau[div+i];
          }
          soulution = dichotomie(T ,nbr_s);
      }else {
          soulution = tableau[div];
      }

      return  soulution;
    }
}
