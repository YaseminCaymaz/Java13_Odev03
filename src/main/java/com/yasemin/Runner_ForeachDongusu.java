package com.yasemin;

/**
 * Java'da Foreach deyimi adında da anlaşılacağı gibi bir döngüyü ifader eder. Genelde dizilerdeki ve listelerdeki
 * elemanları daha hızlı şekilde ulaşmak için kullanılan kısa bir yöntemdir. Kısacası for döngüsünün modifiye edilmiş halidir.
 */
public class Runner_ForeachDongusu {
    public static void main(String[] args) {
       int[] sayilar={1,2,8,55,487,665,3644,55,4};
       String[] gunler={"Pazartesi","Sali","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
       for (int sayi:sayilar)
           System.out.println(sayi);
       for (String gun:gunler)
           System.out.println(gun);

    }
}
