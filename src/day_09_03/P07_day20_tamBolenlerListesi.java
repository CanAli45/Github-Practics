package day_09_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_day20_tamBolenlerListesi {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan main method'da pozitif bir tamsayi alip,
        //         o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsaiy giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(pozitifBolenleriListele(girilenSayi));

    }
    public static List<Integer> pozitifBolenleriListele(int verilenSayi){

        List<Integer> pozitifBolenlerListesi=new ArrayList<>();


        for (int i = 1; i <verilenSayi ; i++) {
            if (verilenSayi%i==0){
                pozitifBolenlerListesi.add(i);
            }
        }
        return pozitifBolenlerListesi;
    }
}
