package day_03_10_Team09;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
            Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
                    “Sayi 5’in tam kati” yazdirin.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi%5==0 ? "Sayi 5'in tam katidir" : "Sayi 5'in tam kati degildir");
    }
}
