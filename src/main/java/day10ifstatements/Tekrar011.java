package day10ifstatements;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Tekrar011 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarları icin 3 tane uzunluk giriniz..");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

        boolean ucgenMi = a + b > c && c > Math.abs(a - b) &&
                a + c > b && b > Math.abs(a - c) &&
                b + c > a && a > Math.abs(b - c);

        //clean olmasi icin parantez icini kisa tutmak gerekir

        if (ucgenMi) {
            if (a == b && a == c) {
                System.out.println("Eskenar ucgendir");
            } else {
                System.out.println("Ucgen ama eskenar degildir");
            }
        } else {
            System.out.println("Sen ucgen değilsin");
        }

        //-----------------------------------------------------------------------------------------------------------//

        Scanner input2 = new Scanner(System.in);
        System.out.println("Uckenin kenarlari icin 3 adet uzunluk giriniz...");

        double x = input2.nextDouble();
        double y = input2.nextDouble();
        double z = input2.nextDouble();

        boolean acabaUcgenMi = x + y > z && z > Math.abs(x - y) &&
                x + z > y && y > Math.abs(x - y) &&
                y + z > x && x > Math.abs(y - z);

        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Gecerli kenar uzunlugu giriniz..");
        } else if (acabaUcgenMi) {

            if (x == y && y == z) {
                System.out.println("Esgenar ucgendir..");
            } else if (x == y || y == z || a == z) {
                System.out.println("Ikizkenar ucgendir..");
            } else {
                System.out.println("Cesitkenar ucgendir..");
            }//nested if

        } else {
            System.out.println("Ucgen olma kuralina uymamaktadir..");
        }

        //-----------------------------------------------------------------------------------------------------------//

        Scanner input3 = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz..");
        String pwd = input3.nextLine();

        char firstChar = pwd.charAt(0);

        if ('A' <= firstChar && firstChar <= 'Z') {
            if (firstChar == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password cunku buyuk harf ama A değil");
            }
        } else if ('a' <= firstChar && firstChar <= 'z') {
            if (firstChar == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password cunku kucuk harf ama z değil");
            }
        } else {
            System.out.println("Ilk karakter harf olmalidir..");
        }

    }//main
}//class
