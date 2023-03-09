package day_09_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_day20_istenmeyeniSil {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        List<String> liste = P04_day20_kullaniciyaListeOlusturmak.kullaniciyaListOlusturma();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf giriniz");

        String istenmeyenHarf = scan.next().substring(0, 1);

        List<String> ayiklanmisList = istenmeyenHarfIcerenleriSil(liste, istenmeyenHarf);
        System.out.println(ayiklanmisList);
    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {

        List<String> kalanlarListesi = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            if (!liste.get(i).contains(istenmeyenHarf)) {
                kalanlarListesi.add(liste.get(i));
            }

        }
        return kalanlarListesi;
    }
}
