package day_03_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8};

        // arr array'inin elementlerini iceren bir arrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("Sayilar listesi :" + sayilar);

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Arrayden liste cevrilen :" + arraydenList);
        System.out.println("********************");

        sayilar.add(11);

        System.out.println("Sayilarlistesi :" + sayilar);
        System.out.println("Array'den liste cevrilen :" + arraydenList);
        System.out.println("Sayilar'a 11 ekledikten sonra");

        sayilar.remove(0);

        System.out.println("Sayilarlistesi :" + sayilar);
        System.out.println("Array'den liste cevrilen :" + arraydenList);

        System.out.println("Arr Sayilarlistesi :" + Arrays.toString(arr));
        System.out.println("Sayilar'in 0. indexi kaldirdiktan sonra");

        arr[0] = 22;
        System.out.println("=====array'i degistirdikten sonra=====");
        System.out.println("Array          :" + Arrays.toString(arr));
        System.out.println("Array'den list :" + arraydenList);

        arraydenList.set(1, 45);
        System.out.println("=====list'i degistirdikten sonra=====");
        System.out.println("Array          :" + Arrays.toString(arr));
        System.out.println("Array'den list :" + arraydenList);
    }
}
