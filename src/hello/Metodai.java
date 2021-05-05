package hello;

import java.util.Scanner;

public class Metodai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("1 sk:");
//        int sk1 = sc.nextInt();
//        System.out.println("2 sk:");
//        int sk2 = sc.nextInt();
//        System.out.println("3 sk:");
//        int sk3 = sc.nextInt();
//        System.out.println("4 sk:");
//        int sk4 = sc.nextInt();
//
//        int suma1 = skaiciuSuma(sk1, sk2);
//        System.out.println(suma1);
//        int suma2 = skaiciuSuma(sk3, sk4);
//        System.out.println(suma2);
        System.out.println(skaiciuSuma(skaiciuSuma(2, 4), skaiciuSuma(1, 3)));
        //                 skaiciuSuma(         9       ,        6          )
        //                                              30

//        if (sk1 > sk2) {
//            int tmp = sk1;
//            sk1 = sk2;
//            sk2 = tmp;
//        }
//
//        int suma1 = 0;
//        for (int i = sk1; i < sk2; i++) {
//            suma1 += i;
//
//        }
//        System.out.println(suma1);
//
//        if (sk3 > sk4) {
//            int tmp = sk3;
//            sk3 = sk4;
//            sk4 = tmp;
//        }
//
//        int suma2 = 0;
//        for (int i = sk3; i < sk4; i++) {
//            suma2 += i;
//
//        }
//       System.out.println(suma2);
        skaiciuSpausdinimas(1, 7);
        skaiciuSpausdinimas(15, 9);
        System.out.println("Pabaiga");
    }

    public static int skaiciuSuma(int s1, int s2) {
        if (s1 > s2) {
            int tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int suma = 0;
        for (int i = s1; i <= s2; i++) {
            suma += i;
        }
        return suma;

    }

    public static void skaiciuSpausdinimas(int nuo, int iki) {
        if (nuo > iki) {
            System.out.println("nuo didesnis uz iki");
            return;
        }
        for (int i = nuo; i < iki; i++) {
            System.out.println(i);

        }
    }

}
