package day_03_09;

import java.util.ArrayList;
import java.util.List;

public class P10_day20_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);

        int temp=0;

        temp=sayilar.get(2);
        System.out.println(sayilar.set(2, sayilar.get(5)));
        sayilar.set(5,temp);
        System.out.println(sayilar);

    }



}
