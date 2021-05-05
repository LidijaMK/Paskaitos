package hello;

import java.util.Scanner;

public class Ciklai {

    public static void main(String[] args) {

// CIKLAS FOR

        int iki = 100;
        
        for (int i = 1; i <= iki; i = i+2) {         // nelyginiai skaiciai, tada nereikia nieko tikrinti
            System.out.println(i);
        }
        System.out.println("pabaiga");
        System.out.println(iki);
    //    System.out.println(i);  neveikia, nes kai baigiasi ciklas, ciklo for skopas numirsta, kartu su juo numirsta ir kintamasis i (uz skopo ribu jo nera) 
    
    
    

//        int i;
//        for (i = 1; i <= 3; i++) {
//            System.out.println(i);
//        }
//        System.out.println("pabaiga");
//        System.out.println(i);
//        int i = 1;
//        for (;;) {
//            System.out.println(i++);
//        }
//        int i = 1;
//        while (true) {
//            System.out.println(i++);
//        }
//        int i = 1;
//        do {
//            System.out.println(i++);
//        } while (true);
//        int i = 1;
//        for (; i <= 3;) {
//            System.out.println(i++);
//        }
//        System.out.println("pabaiga");
//        System.out.println(i);
//        
//        int i;
//        for (i = 1; i <= 3; i++) {
//            System.out.println(i);
//        }
//        System.out.println("pabaiga");
//        System.out.println(i);
// CIKLAS DO WHILE
//        Scanner sc = new Scanner(System.in);
//        int a = 5;
//        int b = 1;
//
//        while (a <= b) {
//            System.out.println(a++);
//        }
//        System.out.println("---------");
//        a = 5;
//        do {
//            System.out.println(a++);
//        } while (a <= b);
    }

}
