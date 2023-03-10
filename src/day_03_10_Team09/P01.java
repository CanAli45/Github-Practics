package day_03_10_Team09;

import java.util.Locale;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        /*
             Soru 4- Kullanicidan gunu ismini girmesini isteyin,
                     girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde,
                     hafta sonu tatiline kac gun kaldigini yazdirin,
                     girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan.nextLine().toUpperCase(Locale.ROOT);


        switch (gun) {
            case "PAZARTESI":
                System.out.println("Simdi calisma zamani tatile  5 gun var");
                break;
            case "SALI":
                System.out.println("Simdi calisma zamani tatile  4 gun var");
                break;
            case "CARSAMBA":
                System.out.println("Simdi calisma zamani tatile  3 gun var");
                break;
            case "PERSEMBE":
                System.out.println("Simdi calisma zamani tatile  2 gun var");
                break;
            case "CUMA":
                System.out.println("Simdi calisma zamani tatile  1 gun var");
                break;
            case "CUMARTESİ":
                System.out.println("Simdi dinlenme zamani");
                break;
            case "PAZAR":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis giris");


        }

        if (gun.equals("pazartesi")) {
            System.out.println("Şimdi calişma zamanı tatile 5 gün var");
        } else if (gun.equals("salı")) {
            System.out.println("Şimdi calişma zamanı tatile 4 gün var");
        } else if (gun.equals("çarşamba")) {
            System.out.println("Şimdi calişma zamanı tatile 3 gün var");
        } else if (gun.equals("perşembe")) {
            System.out.println("Şimdi calişma zamanı tatile 2 gün var");
        } else if (gun.equals("cuma")) {
            System.out.println("Şimdi calişma zamanı tatile 1 gün var");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Şimdi tatil zamanı");
        } else if (gun.equals("pazar")) {
            System.out.println("Şimdi tatil zamanı");
        } else {
            System.out.println("Yanlış gün girişi yapılmıştır.");
        }
    }
}
