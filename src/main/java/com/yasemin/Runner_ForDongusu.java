package com.yasemin;

import java.util.Scanner;

/**
 * Java’da for döngüsü, oluşturacağımız döngüler içerisinde daha kolay bir tanımlama
 * ve kontrol ayarı yapabileceğimiz döngü türüdür. For döngüsü içerisinde belirleyeceğimiz
 * koşul doğru olduğu sürece içerisindeki kod satırları çalışır ve koşul sağlanmadığı takdirde
 * diğer döngü türlerinde olduğu gibi işlem sonlandırılır.
 */
public class Runner_ForDongusu {
    public static void main(String[] args) {
        /**
         * Soru: Armstrong Sayıları:
         * Bir Armstrong sayısı, n basamaklı bir sayının basamaklarının n'inci kuvvetinin toplamına eşit olduğu bir sayıdır.
         * Örneğin, 153 bir Armstrong sayısıdır, çünkü 1^3 + 5^3 + 3^3 = 153.
         * Kullanıcıdan bir sayı alarak, bu sayının Armstrong sayısı olup olmadığını kontrol eden bir Java programı yazın.
         */
        System.out.println("Lütfen bir sayi giriniz..:");
        int sayi=new Scanner(System.in).nextInt();
        int sayi2=sayi;
        int basamak=String.valueOf(sayi).length();
        int toplam=0;
        for (int i=0;i<basamak;i++){
            int kalan=sayi%10;
            sayi=sayi/10;
            int temp=1;
            for (int j=0;j<basamak;j++){
                temp*=kalan;
            }
            toplam+=temp;
        }
        if(sayi2==toplam)
            System.out.println(sayi2+" bir Armstrong sayıdır.");
        else
            System.out.println(sayi2+" Armstrong sayı degildir.");
    }
}
