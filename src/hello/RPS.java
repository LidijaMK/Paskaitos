
package hello;

import java.util.Scanner;


public class RPS {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
 
//        int pasirinkimas;
//        do {
//            System.out.println("1. Akmuo");
//            System.out.println("2. Popierius");
//            System.out.println("3. Zirkles");
//            System.out.println("0. Pabaiga");
//            pasirinkimas = sc.nextInt();
//            if (pasirinkimas < 0 || pasirinkimas > 3) {
//                System.out.println("Idiote, ismok naudotis klaviatura !!!");
//            } else if (pasirinkimas > 0) {
//                int kp = (int) (Math.random() * 3 + 1);
//                switch (kp) {
//                    case 1:
//                        System.out.println("Kompiterio pasirinkimas: Akmuo");
//                        break;
//                    case 2:
//                        System.out.println("Kompiterio pasirinkimas: Popierius");
//                        break;
//                    case 3:
//                        System.out.println("Kompiterio pasirinkimas: Zirkles");
//                        break;
//                }
//                if (pasirinkimas == kp) {
//                    System.out.println("Lygiosios");
//                } else if (pasirinkimas == 1) {
//                    if (kp == 2) {
//                        System.out.println("Laimejo kompiuteris");
//                    } else {
//                        System.out.println("Laimejo zaidejas");
//                    }
//                } else if (pasirinkimas == 2) {
//                    if (kp == 3) {
//                        System.out.println("Laimejo kompiuteris");
//                    } else {
//                        System.out.println("Laimejo zaidejas");
//                    }
//                } else {
//                    if (kp == 1) {
//                        System.out.println("Laimejo kompiuteris");
//                    } else {
//                        System.out.println("Laimejo zaidejas");
//                    }
//                }
//            }
//            
//        } while (pasirinkimas != 0);

 System.out.println("Kiek kartu zaisti:");
 
        int kiekis = sc.nextInt();
 
        int lygiosios = 0;
        int k1Akmuo = 0;
        int k1Popierius = 0;
        int k1Zirkles = 0;
        int k1Laimejo = 0;
 
        int k2Akmuo = 0;
        int k2Popierius = 0;
        int k2Zirkles = 0;
        int k2Laimejo = 0;
 
        for (int i = 0; i < kiekis; i++) {
            int k1p = (int) (Math.random() * 3 + 1);
            switch (k1p) {
                case 1:
                    k1Akmuo++;
                    break;
                case 2:
                    k1Popierius++;
                    break;
                case 3:
                    k1Zirkles++;
                    break;
            }
            int k2p = (int) (Math.random() * 3 + 1);
            switch (k2p) {
                case 1:
                    k2Akmuo++;
                    break;
                case 2:
                    k2Popierius++;
                    break;
                case 3:
                    k2Zirkles++;
                    break;
            }
            if (k1p == k2p) {
                lygiosios++;
            } else if (k1p == 1) {
                if (k2p == 2) {
                    k2Laimejo++;
                } else {
                    k1Laimejo++;
                }
            } else if (k1p == 2) {
                if (k2p == 3) {
                    k2Laimejo++;
                } else {
                    k1Laimejo++;
                }
            } else {
                if (k2p == 1) {
                    k2Laimejo++;
                } else {
                    k1Laimejo++;
                }
            }
        }
 
        System.out.print("comp1 laimejo: ");
        System.out.println(k1Laimejo);
        System.out.print("comp2 laimejo: ");
        System.out.println(k2Laimejo);
        System.out.print("lygiosios: ");
        System.out.println(lygiosios);
        System.out.println();
        System.out.println("comp1:");
        System.out.print("pasirino akmeni: ");
        System.out.println(k1Akmuo);
        System.out.print("pasirino popieriu: ");
        System.out.println(k1Popierius);
        System.out.print("pasirino zirkles: ");
        System.out.println(k1Zirkles);
        System.out.println();
        System.out.println("comp2:");
        System.out.print("pasirino akmeni: ");
        System.out.println(k2Akmuo);
        System.out.print("pasirino popieriu: ");
        System.out.println(k2Popierius);
        System.out.print("pasirino zirkles: ");
        System.out.println(k2Zirkles);
    }
    
}

