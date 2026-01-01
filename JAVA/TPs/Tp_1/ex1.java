package TP_2eme_anne_1;
import java.lang.Math;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int i = 2;
        int n = 1;
        double S = 1;
        while (Math.abs(S - 1.33) > 0.01) {

            if (i % 2 == 0) {
                S = S + 1.0 / i;
                i++;
            } else {
                S = S - 1.0 / i;
                i++;
            }
            n++;
            System.out.println(S);

        }
        System.out.println(S);
        System.out.println(n);

    }
}

