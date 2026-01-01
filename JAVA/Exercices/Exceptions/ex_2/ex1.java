package Jfram.testExam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("entre le nombre : ");
        int n = reader.nextInt();
        try {
             int a = sqrt(n);
            System.out.println(a);
        }catch (exepPersonel e){
            System.out.println(e.getMessage());
        }


    }

    public static int sqrt (int n) throws exepPersonel{
        if (n < 0 ){
            throw new exepPersonel("number negative ") ;
        }
        return  n*n ;
    }
}
