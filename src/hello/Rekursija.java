package hello;

import java.util.Scanner;

public class Rekursija {

    public static long fakt(long sk) {
        if (sk < 0) {
            return -1;
        }
        if (sk == 0) {
            return 1;
        }
        return sk * fakt(sk - 1);
    }

    public static void main(String[] args) {

        int sk = 4;
        System.out.println(fakt(sk));
        System.out.println(fakt(7));
        System.out.println(fakt(-7));

        int f = 1;
        for (int i = sk; i > 1; i--) {
            System.out.print (i + "x");
            f *= i;
        }
        System.out.print("1=");
        System.out.println(f);
    }

}
