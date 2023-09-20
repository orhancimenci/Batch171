package day07stringmanipulations;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz..");
        String sifre = input.nextLine();

        //1. gereklilik: En az 8 character olsun
        boolean uzunluk = sifre.length() > 7;
        System.out.println("uzunluk uygun mu= " + uzunluk);

        //2. gereklilik: Space characteri passwordde olmasin
        boolean spaceVarMi = !(sifre.contains(" "));
        System.out.println("space karakteri var mı!!!= " + spaceVarMi);

        //3. gereklilik: En az bir buyuk harf olsun
        boolean buyukHarf = sifre.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("buyuk harf var mı= " + buyukHarf);

        //4. gereklilik: En az bir kucuk harf olsun
        boolean kucukHarf = sifre.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("kucuk harf var mı= " + kucukHarf);

        //5. gereklilik: En az bir rakam olsun
        boolean rakam = sifre.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("rakam var mı= " + rakam);

        //6. gereklilik: En az bir karakter olsun
        boolean noktalamaIsareti = sifre.replaceAll("[\\\\p{Punct}]", "").length() > 0;
        System.out.println("noktalama isareti var mı= " + noktalamaIsareti);

        System.out.println("Sifre gecerli mi= " + (uzunluk && spaceVarMi && buyukHarf && kucukHarf && rakam && noktalamaIsareti));


    }
}
