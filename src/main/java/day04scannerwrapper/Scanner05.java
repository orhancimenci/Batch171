package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin
        //ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        /*
        NOTLARIM:
         1. bir sayinin son rakamini alabilmek icin; o sayiyi "10 a bolup" kalani almaliyiz
         2. "% modulus operator" solunda bulunan sayinin, saginda bulunan sayiya bolumunden kalani verir
            dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
         3. bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar
            java  bu durumda yuvarlama yapmaz, ondalik kismi iptal eder(siler), tam sayi return eder
            dolayisiyla bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz
        */

        //son rakami al
        int birlerBasamagi = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int sondanIkinci = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan besinci rakami al
        int sondanBesinci = number % 10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("sondanIkinci = " + sondanIkinci);
        System.out.println("sondanUcuncu = " + sondanUcuncu);
        System.out.println("sondanDorduncu = " + sondanDorduncu);
        System.out.println("sondanBesinci = " + sondanBesinci);

        System.out.println(sondanBesinci + sondanDorduncu + sondanIkinci + birlerBasamagi);

    }

}
