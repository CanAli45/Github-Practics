package day_09_03;

import java.util.ArrayList;
import java.util.List;

public class P03_day20_indexof {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");

        System.out.println(isimler);

        System.out.println(isimler.get(2)); // Emre

        System.out.println(isimler.indexOf("Ferhat")); // 3

        System.out.println(isimler.lastIndexOf("Ferhat")); // 3

        isimler.add("Mustafa");
        System.out.println(isimler);

        System.out.println(isimler.indexOf("Mustafa")); // 1

        System.out.println(isimler.lastIndexOf("Mustafa")); // 5

        System.out.println(isimler.indexOf("Hilal"));  //-1

        System.out.println(isimler.lastIndexOf("Fatih")); // -1

    }
}
