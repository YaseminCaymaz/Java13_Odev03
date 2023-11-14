package com.yasemin;

import java.util.Scanner;

/**
 * WHİLE DONGUSU
 * While döngülerinde, tekrar sayısı belli değildir. Döngü içerisinde oluşturmuş olduğumuz şart boolean türde
 * true olduğu sürece döngü devam eder, bu true değer false döndüğü takdirde döngüden çıkılır ve program döngünün
 * bittiği yerden çalışmaya devam eder.
 */
public class Runner_WhileDongusu {
    public static void main(String[] args) {
        /**
         * Soru: Faktöriyel Hesaplama:
         * Kullanıcıdan bir sayı alarak, girilen sayının faktöriyelini hesaplayan bir Java programı yazın.
         */
        System.out.println("Faktoriyelini ögrenmek istediginiz sayıyı giriniz..:");
        int sayi=new Scanner(System.in).nextInt();
        int sayac=1,sonuc=1;
        while (sayac<=sayi){
            sonuc*=sayac;
            sayac++;
        }
        System.out.println(sayi+" nın faktoriyeli.:"+sonuc);
    }
}
