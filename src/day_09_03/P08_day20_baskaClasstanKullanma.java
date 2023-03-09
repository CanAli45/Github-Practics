package day_09_03;

public class P08_day20_baskaClasstanKullanma {
    public static void main(String[] args) {
        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cok ise
        // "Guzel", yoksa "Kotu" yazdirin

        int sayi=1000;

        int pozitifTamBolenleriSayisi=P07_day20_tamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        System.out.println(pozitifTamBolenleriSayisi);

        if (pozitifTamBolenleriSayisi>10){
            System.out.println("Guzel");
        }else {
            System.out.println("Kotu");
        }


    }
}
