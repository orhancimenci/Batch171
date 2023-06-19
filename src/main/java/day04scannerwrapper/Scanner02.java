package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Ornek: Kullanicidan adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen adresinizi giriniz...");

        //nextLine methodu kullanicidan cok kelilmeli string almak icin kullanilir
        String adress = input.nextLine();
        System.out.println(adress);

    }
}
