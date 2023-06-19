package day04scannerwrapper;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        /*
        Homework
        1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
        2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        ornegin => 312 icin 3+1+2=6
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen üc tane sayi yaziniz..");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();
        double ortalama = ((sayi1+sayi2+sayi3)/3);

        System.out.println("ortalama= " + ortalama);

        System.out.println("Üc basamakli bir sayi giriniz..");
        int number = input.nextInt();

        int birlerBasamagi = number%10;
        number = number/10;

        int onlarBasamagi = number%10;
        number = number/10;

        int yuzlerBasamagi = number%10;
        number = number/10;

        System.out.println("Rakamlar Toplami = " + (birlerBasamagi+onlarBasamagi+yuzlerBasamagi));


    }
}
