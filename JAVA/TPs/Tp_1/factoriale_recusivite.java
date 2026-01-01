package TP_2eme_anne_1;

import java.util.Scanner;

public class factoriale_recusivite {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Bonjour ce programme va de calculer le factoriale de n : ");
        int n = reader.nextInt();
        int f ;
        f = factorial(n);
        System.out.println(n+"! = "+f);

    }

    public static int factorial(int n){
        int f = 1;
        if (n == 0){
            f =1;
        }else{
            f = n * factorial(n-1);
        }
        return f ;
    }
}
