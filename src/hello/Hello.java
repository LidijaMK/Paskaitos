package hello;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Atspausdinti vienazenklis, jei sk yra nuo 0 iki 9 ir nieko nepspausdinti jei skaicius yra neigiamas arba didesnis uz 9
         */
//        System.out.println("Skaicius");
//        int sk = sc.nextInt();
//        
//        if (sk >= 0 && sk <=9) {
//            System.out.println("vienazenklis");
//        }
//        System.out.println("pabaiga");
//
//        int a = 10;
//        {
//            
//            int sk = 10;
//            System.out.println(a * sk);
//        }
//        int sk = 15;
//        System.out.println(a * sk);
//        System.out.print("labas ");
//        System.out.println("pasauli");

        int a = 1;
        int b = 1;

        while (a < 5) {
            System.out.println(a);
            while (b < 5) {
                System.out.println(a + b);
                b++;
            }
            System.out.println("-----");
            a++;           
        }
         System.out.println("pabaiga");

       


//        int a = 1;
//
//        while (a < 3) {
//            System.out.println(a);
//            int b = 1;
//            while (b < 3) {
//                System.out.println(a + b);
//                b++;
//            }
//            a++;
//            System.out.println("----");
//        }
//
//        System.out.println("pabaiga");

        /*
        a: 1
         */
        // && vs &
        // || vs |
//        int a = -5;
//        System.out.println(a);
//        
//        if (a < 0 || a++ > 9) {
//            System.out.println("nevienazenklis");
//        }
//        System.out.println(a);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Skaicius");
//            int a = 10;
//            System.out.println(a);
        //  int b = ++a;
        // paimame a reiksme => 10
        // padidiname reiksme 1 => 11
        // padedame padidinta reiksme i a => a: 11
        // naudojame padidinta reiksme (11)
        // priskiriame i b => b: 11
        //   int b = a++;
        // paimame reiksme => 10
        // padidiname reiksme 1 => 11
        // padedame padidinta reiksme i a => a: 11
        // naudojame pradine reiksme (10)
        // priskiriame i b => b: 10
        //  System.out.println(a);
        // System.out.println(b);
//         int sk = sc.nextInt();
//        if (sk % 2 == 0 && sk < 10 && sk >= 0) {        
//    //       8 % 2
        //         0     
        //                     8 < 10
        //                      true
        //                                 8 >= 0
        //                                   true
        //       0 == 0
        //        true
        //             true && true    
        //                 true
        //                      true    &&   true
        //                              true
        //OPERATORIAI
        //    if (sk >= 0 && sk < 10) {
        //       4 >=0
        //        true
        //                   4 < 10
        //                     true
        //         true && true
        //             true
        //        if (sk < 0 || sk >9) {
        //       5 < 0
        //        false
        //                   5 > 9
        //                   false
        //         false || false
        //             false
        //          if (!(sk < 0 || sk >9)) {
        //       5 < 0
        //        false
        //                         5 > 9
        //                         false
        //                false || false
        //                    false
        //            !false
        //             true
        //  System.out.println("vienzenklis lyginis");
    }

    //    System.out.println("pabaiga");
    // System.out.println("Ivesk antra skaiciu");
    //  int sk2 = sc.nextInt();
    /*
        System.out.println("Ivesk antra skaiciu");
        int sk3 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int sk4 = sc.nextInt();

     */
    //      istraukti sakni
    //      double sk = 100;
    //      sk = Math.sqrt(sk);
    //      System.out.println(sk);
    /*
        System.out.println("skirtumas");
        
        boolean pirmasDidesnis = sk1 > sk2;

        if (pirmasDidesnis) {
            System.out.println(sk1 - sk2);
        } else {
            System.out.println(sk2 - sk1);
        }
     */
 /*
        sk1: 28
        sk2: 105
        pirmasDidesnis: false
        105 - 28 = 77
     */
 /*
        sk1: 105
        sk2: 128
        pirmasDidesnis: true
        105 - 28 = 77
     */
 /*
    sk1: 18
    sk2: 21
     */
 /*
   
    byte    : 0
    short   : 0
    int     : 0 
    long    : 0
    float   : 0.0 
    double  : 0.0 
    char    : '\u0000'
    boolean : false
    
    
     */
}
