package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kullaniciya ilk mesaj verilir..");
        String kullaniciAdi = input.nextLine();
        System.out.println("kullaniciAdi = " + kullaniciAdi);

        System.out.println("lutfen adresinizi giriniz..");
        String adresEv = input.nextLine();
        System.out.println(adresEv);

        System.out.println("iki sayi giriniz");
        int ilkSayi = input.nextInt();
        int ikinciSayi = input.nextInt();
        System.out.println(ilkSayi + "-" + ikinciSayi);

        Scanner girdi = new Scanner(System.in);
        System.out.println("dikdörtgenin kısa kenarı");
        double kisaKenar = girdi.nextDouble();
        System.out.println("uzun kenarı");
        double uzunKenar = girdi.nextDouble();

        System.out.println("alan= " + (kisaKenar * uzunKenar));
        System.out.println("cevre= " + (2 * kisaKenar + 2 * uzunKenar));//cevre=

        double k = kisaKenar;
        double u = uzunKenar;
        alanHesapla(k, u);

        double x = 7;
        double y = 8;
        alanHesapla(x, y);


    }

    private static void alanHesapla(double k, double u) {
        System.out.println("dikdortgenAlan=" + k * u);
    }


}
