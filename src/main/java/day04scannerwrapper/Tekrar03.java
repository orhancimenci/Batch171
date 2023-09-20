package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bes basamakli bir sayi giriniz..");
        int sayi = input.nextInt();

        int birler = sayi % 10; //birler basagini aliyoruz
        sayi = sayi / 10; //birler basmagini siler

        int onlar = sayi % 10;
        sayi = sayi / 10;

        int yuzler = sayi % 10;
        sayi = sayi / 10;

        int binler = sayi % 10;
        sayi = sayi / 10;

        int onBinler = sayi % 10;

        System.out.println(birler + onlar + binler + onBinler);


    }
}
