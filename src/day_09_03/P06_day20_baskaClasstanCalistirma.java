package day_09_03;

import java.util.ArrayList;
import java.util.List;

public class P06_day20_baskaClasstanCalistirma {
    public static void main(String[] args) {


    // P05'deki istenmeyenleri sil methodunu buradan kullanalim

    List<String> urunler=new ArrayList<>();

    urunler.add("Nutella");
    urunler.add("Cikolatali Gofret");
    urunler.add("Cokoprens");
    urunler.add("Cokomel");
    String istenmeyenHarf="o";

    System.out.println(P05_day20_istenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler, istenmeyenHarf));

        System.out.println(P05_day20_istenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler, "a"));
    }

}

