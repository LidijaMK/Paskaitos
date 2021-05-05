package hello;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ivesk savaites dienos numeri");
        int sk = sc.nextInt();

        switch (sk) {
            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;
            case 3:
                System.out.println("Treciadienis");
                break;
            case 4:
                System.out.println("Ketvirtadienis");
                break;
            case 5:
                System.out.println("Penktadienis");
                break;
            case 6:
                System.out.println("Sestadienis");
                break;
            case 7:
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Idiote, ner tokios savaites dienos!!!!");
        }

        switch (sk) {
            case 1, 2, 3, 4, 5:
                System.out.println("Darbo diena");
                break;
            case 6:
                System.out.println("Savaitgalis");
                break;
            case 7:
                System.out.println("Savaitgalis");
                break;
            default:
                System.out.println("Idiote, tu arsi visa gyvenima!!!!");
        }

//        if (sk == 1) {
//            System.out.println("Pirmadienis");
//        } else if (sk == 2) {
//            System.out.println("Antradienis");
//
//        } else if (sk == 3) {
//            System.out.println("Treciadienis");
//
//        } else if (sk == 4) {
//            System.out.println("Ketvirtadienis");
//
//        } else if (sk == 5) {
//            System.out.println("Penktadienis");
//
//        } else if (sk == 6) {
//            System.out.println("Sestadienis");
//
//        } else if (sk == 7) {
//            System.out.println("Sekmadienis");
//        }
//        
        //       System.out.println(sk);
//        int t;
//        if (sk > 0) {
//            t = 1;
//        } else {
//            t = -1;
//        }
//        if (sk > 0) {
//            t = 1;
//        } else if (sk == 0) {
//            t = 0;
//        } else {
//            t = -1;
//        }
//        t = sk > 0 ? 1 : (sk == 0 ? 0 : -1);
//        t = sk > 0 ? 1 : -1;
        //       System.out.println(t);
    }

}
