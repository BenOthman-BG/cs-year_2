package TP_2eme_anne_1;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        System.out.println("Bonjour ce programme : ");
        System.out.print("entrer un nombre : ");
        Scanner reader = new Scanner(System.in);
        int A = reader.nextInt();
        int i ;
        int[] table = new int[A];
        int x = 0 ;
        for (i=0 ;i<A ;i++ ){
            if (((i+1) % 2 ==0) && ((i+1) % 3 != 0)){
                table[x] = i+1;
                x++;
            }
        }

        for (i=0 ; i<x;i++){
            System.out.println(table[i]);
        }
        int s = 0 ;
        for (i=0 ; i<x;i++){
            s = s + table[i];
        }
        System.out.println("la somme est : "+s);

    }
}
