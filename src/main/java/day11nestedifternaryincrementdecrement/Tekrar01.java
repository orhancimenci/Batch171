package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışan cinsiyetini girin (KADIN/ERKEK): ");
        String cinsiyet = scanner.nextLine();

        System.out.print("Çalışan yaşını girin: ");
        int yas = scanner.nextInt();

        if (yas < 0 || yas > 120) {
            System.out.println("Geçersiz yaş değeri girdiniz!");
        } else {
            if (cinsiyet.equalsIgnoreCase("KADIN")) {
                if (yas > 60) {
                    System.out.println("Emekli olabilir.");
                } else {
                    System.out.println("Emekli olamaz.");
                }
            } else if (cinsiyet.equalsIgnoreCase("ERKEK")) {
                if (yas > 65) {
                    System.out.println("Emekli olabilir.");
                } else {
                    System.out.println("Emekli olamaz.");
                }
            } else {
                System.out.println("Geçersiz cinsiyet değeri girdiniz!");
            }
        }
    }
}
