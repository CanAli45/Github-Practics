package day_03_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P03 {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan  sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.

        int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        List<Integer> benzersizElemnetListesi=new ArrayList<>();

        for (int each:arr
             ) {
            if (!benzersizElemnetListesi.contains(each)){
                benzersizElemnetListesi.add(each);
            }
        }
        System.out.println(benzersizElemnetListesi);

        arr=new  int[benzersizElemnetListesi.size()];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=benzersizElemnetListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));



    }
}
