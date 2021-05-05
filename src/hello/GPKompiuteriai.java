
package hello;

import java.util.Scanner;

public class GPKompiuteriai {
    
     public static int kauliukoMetimas() {
        return (int) (Math.random() * 6 + 1);
    } 

    public static void main(String[] args) {
        int k1t = 0;
        int k2t = 0;

 

        do {
            int k1m;
            int k1mt = 0;
            int k1mk = 0;
            System.out.print("Comp1: ");
            do {
                k1m = kauliukoMetimas();
                System.out.print(k1m);
                System.out.print(" ");
                if (k1m != 1) {
                    k1mt += k1m;
                }
            } while (k1m != 1 && ++k1mk < 5 && k1mt + k1t < 100);
            if (k1m != 1) {
                k1t += k1mt;
            }
            System.out.println(k1t);
            if (k1t < 100) {
                int k2m;
                int k2mt = 0;
                System.out.print("Comp2: ");
                do {
                    k2m = kauliukoMetimas();
                    System.out.print(k2m);
                    System.out.print(" ");
                    if (k2m != 1) {
                        k2mt += k2m;
                    }
                } while (k2m != 1 && k2mt < 18 && k2mt + k2t < 100);
                if (k2m != 1) {
                    k2t += k2mt;
                }
                System.out.println(k2t);
            }
        } while (k1t < 100 && k2t < 100);
        if (k1t > k2t) {
            System.out.println("Laimejo 1-as kompiuteris");
        } else {
            System.out.println("Laimejo 2-as kompiuteris");
        }
    }
}
