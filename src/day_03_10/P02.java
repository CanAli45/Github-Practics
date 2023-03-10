package day_03_10;

public class P02 {
    public static void main(String[] args) {

        // arr'in tum elementlerinin toplamini yazdirin

        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Elementler toplami :"+toplam);

        // arr'in elementlerinden 3 ile bolunebilenleri yazdirin

        for (int each:arr
             ) {
            if (each%3==0) System.out.print(each+" ");
        }
        System.out.println("");

        // arr'in elementleri icinde kac tane tek sayi oldugunu bulun

        for (int each:arr
             ) {
            if (each%2!=0) System.out.print(each+" ");
        }
        System.out.println("");

    }
}
