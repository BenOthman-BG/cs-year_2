package TPs.Tp_1;

import java.util.Scanner;

public class factoriale_recursivite {

	public static void main(String[] args) {
		
        try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Bonjour ce programme va de calculer le factoriale de n : ");
			int n = reader.nextInt();
			int f ;
			f = factorial(n);
			System.out.println(n+"! = "+f);
		}

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
