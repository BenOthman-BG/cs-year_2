package Exercices.Exceptions.ex_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("entre le nombre : ");
        int n = reader.nextInt();
        try {
             int a = sqrt(n);
            System.out.println(a);
        }catch (expPersonel e){
            System.out.println(e.getMessage());
        }


    }

    public static int sqrt (int n) throws expPersonel{
        if (n < 0 ){
            throw new expPersonel("number negative ") ;
        }
        return  n*n ;
    }
}
