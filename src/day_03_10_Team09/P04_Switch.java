package day_03_10_Team09;

import java.util.Scanner;

public class P04_Switch {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam = scan.nextInt();
        switch (rakam) {
            case 0:
                System.out.println("Girdiginiz rakam sifir");
                break;

            case 1:
                System.out.println("Girdiginiz rakam bir");
                break;
            case 2:
                System.out.println("Girdiginiz rakam iki");
                break;

            case 3:
                System.out.println("Girdiginiz rakam uc");
                break;
            case 4:
                System.out.println("Girdiginiz rakam dort");
                break;

            case 5:
                System.out.println("Girdiginiz rakam bes");
                break;
            case 6:
                System.out.println("Girdiginiz rakam alti");
                break;

            case 7:
                System.out.println("Girdiginiz rakam yedi");
                break;
            case 8:
                System.out.println("Girdiginiz rakam sekiz");
                break;

            case 9:
                System.out.println("Girdiginiz rakam dokuz");
                break;
            default:
                System.out.println("Girilen karakter rakam degildir");

        }
    }

}
