package day_03_10;

public class P04 {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        //         karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {2, 3, 5, 0, 1};
        karelerToplamiYazdir(arr);

    }

    public static void karelerToplamiYazdir(int [] arr){

        int karelerToplami=0;
        for (int each:arr
             ) {
            karelerToplami+=each*each;

        }
        System.out.println("Kareler toplami :"+karelerToplami);

    }
}
