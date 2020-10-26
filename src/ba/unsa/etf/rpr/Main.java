package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n) {
        int cifra, suma = 0;
       while(n!=0){
           cifra=n%10;
           suma+=cifra;
           n/=10;
       }
        return suma;
    }

    public static void main(String[] args) {
        // write your code here
        //System.out.println(sumaCifara(2455));

        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }

    }

}
