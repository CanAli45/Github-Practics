package day_03_10;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //       harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //       kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
        String cumle="Java bazen sikici oluyor";



        //cumledeKullanilanHarfiBulma();
        cumledeKullanilanHarfiBulma1(cumle,"a");
    }

    public static void cumledeKullanilanHarfiBulma() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen cumlede bulunmasini istediginiz harfi yaziniz");
        String harf = scan.next();

        String[] karakterler = cumle.split("");

        int sayac = 0;
        for (String each : karakterler
        ) {
            if (each.contains(harf)) {
                sayac++;

            }
            ;

        }


        {
            if (sayac == 0) {
                System.out.println("Girilen harf cumlede kullanilmamistir");


            } else {
                System.out.println("Girilen harf cumlede :" + sayac + " kullanilmistir");
            }


        }
    }
    public static void cumledeKullanilanHarfiBulma1(String cumle, String harf) {


        String[] karakterler = cumle.split("");

        int sayac = 0;
        for (String each : karakterler
        ) {
            if (each.contains(harf)) {
                sayac++;

            }


        }


        {
            if (sayac == 0) {
                System.out.println("Girilen harf cumlede kullanilmamistir");


            } else {
                System.out.println("Girilen harf cumlede :" + sayac + " kullanilmistir");
            }


        }
    }
}
