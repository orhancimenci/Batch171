package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Tekrar011 {
    public static void main(String[] args) {

        int num = 2;
        if (num < 10) {
            System.out.println("Kucuk");
        } else {
            System.out.println("Kucuk degil");
        }

        // Ternary Cozumu:
        String sonuc = num < 10 ? "Kucuk" : "Kucuk degil";
        System.out.println(sonuc);

        //--------------------------------------------------------------------------------------------------------------

        int k = 13;

        if (k % 2 == 0) {
            System.out.println("cift");
        } else {
            System.out.println("tek");
        }

        String result = k % 2 == 0 ? "cift" : "tek";
        System.out.println(result);

        //--------------------------------------------------------------------------------------------------------------

        int a = 12;
        System.out.println(a > 0 ? "Pozitiftir" : "Negatiftir");

        //--------------------------------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz..");

        double first = input.nextDouble();
        double second = input.nextDouble();

        // 1. yol cozumu:
        if (first < second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }

        // 2. yol cozumu:
        double kucukSayi = first < second ? first : second;
        System.out.println(kucukSayi);

        //--------------------------------------------------------------------------------------------------------------

        int x = 10;
        int y = 20;

        int r1 = x < y ? x++ : ++y;

        System.out.println(r1);
        System.out.println(x);
        System.out.println(y);

        int c = 4;
        int r2 = c < 0 ? -1 * c : c;

        int m=5;
        int n=-6;

        Object r3= (m>0 && n>0) || (c<0 && n<0) ? m*n:"farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);


    }
}
