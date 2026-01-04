package Exercices.Exceptions.ex_1;

import java.io.IOException;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        int[] tab = new int[] {2, 4, 6, 8, 10};
        Scanner sc = new
                Scanner(System.in);
        try {
            System.out.print("veuillez saisir l'indice de l'élément à récupérer (entre 0 et 4): ");
            int i = sc.nextInt();
            System.out.println("tab[" + i + "] = " + tab[i]);
            sc.close();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("00");
        }

    }
}