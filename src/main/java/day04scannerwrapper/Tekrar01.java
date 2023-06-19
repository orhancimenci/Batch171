package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Sistemden iceriye yazdir, iceriye bilgi al
        //Scanner objesi olusturduk
        System.out.println("Ilk isminizi giriniz.."); //sistemden disariya yazdir
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz..");
        String lastName = input.next();
        System.out.println(firstName+" "+lastName);


        System.out.println("Lutfen adresinizi giriniz..");
        String adress = input.nextLine();
        System.out.println(adress);


        System.out.println("Lutfen iki sayi giriniz..");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);


        System.out.println("Dikdörtgenin kisa kenar uzunlugunu giriniz..");
        double kisaKenar = input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenar uzunlugunu giriniz..");
        double uzunKenar = input.nextDouble();

        System.out.println("dikdortgeninAlani = " + (kisaKenar * uzunKenar));
        System.out.println("dikdortgeninCevresi = " + (2*kisaKenar + 2*uzunKenar));

        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        int birlerBasamagi = number%10;
        number = number/10;

        int onlarBasamagi = number%10;
        number = number/10;

        int yuzlerBasamagi = number%10;
        number = number/10;

        int onBinlerBasamagi = number%10;
        number = number/10;

        int yuzBinlerBasamagi = number%10;

        System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi+onBinlerBasamagi+yuzBinlerBasamagi);

    }

}
