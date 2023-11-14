package com.yasemin;
/**
 * DÖNGÜLER;
 * 1-Do-While Döngüsü
 * 2-While Döngüsü
 * 3-for Döngüsü
 * Bu döngüler uygun şekilde tasarlandıkları sürece aynı işi yapabilirler. Ama genellikle, kaç kere döneceği belli olmayan,
 * koşulun bir girdiye göre denetlendiği durumlarda While ya da do-while döngüsü kullanılırken, diziler gibi, tekrar sayısı
 * belirli olan durumlarda ise for döngüsü kullanılması tercih edilir.
 */

import java.util.Scanner;

/**
 * DO-WHİLE DÖNGÜSÜ
 * Do-While döngüsünün yukarıda anlatmış olduğum while döngüsünden tek farkı, işleme muhakkak
 * bir kez girmesi ve sonra verilen koşulu kontrol etmesi diyebilirim. Bu durumda bu döngünün en az
 * bir kere çalışacağı anlamına gelmektedir.
 */
public class Runner_DoWhileDongusu {
    public static void main(String[] args) {
        /**
         *Soru: Asal Sayılar:
         * Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir Java programı yazın.
         * Asal sayılar, sadece 1 ve kendisi tarafından bölünebilen sayılardır.
         */
        System.out.println("Lütfen bir sayı giriniz..:");
        int sayi=new Scanner(System.in).nextInt();
        int sayac=2;
        boolean kontrol=true;
        do {
            if(sayi%sayac==0){
                kontrol=false;
                break;
            }
            else
                sayac++;

        }while (sayac<sayi);
        if(kontrol)
            System.out.println(sayi+" sayı asal sayıdır");
        else
            System.out.println(sayi+" sayı asal sayı degildir.");
    }
}
