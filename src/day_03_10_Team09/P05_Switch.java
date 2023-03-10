package day_03_10_Team09;

import java.util.Scanner;

public class P05_Switch {
    public static void main(String[] args) {
        /*
            Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = sayi / 10;

        if (sayi < 100 && sayi >= 10) {
            switch (onlarBasamagi) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                case 9:
                    System.out.print("Doksan");
                    break;

            }
            switch (birlerBasamagi) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.println("alti");
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                case 9:
                    System.out.print("dokuz");
                    break;
            }
        } else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
