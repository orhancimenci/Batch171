package day10ifstatements;

import java.util.Scanner;

public class Homework01 {
    /* Homework
    1) Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
       ve kullaniciya uygun mesaj veren kodu yaziniz

    2) Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
       Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3) Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
       1==> January, 2 ==> February .....
    */
    public static void main(String[] args) {

        // Cevap 1:
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz..");
        String password = input.next();

        if (password.equals("pwd123!")) {
            System.out.println("Sifreniz Dogru Tebriklerr..");
        } else {
            System.out.println("Sifrenizi yanlis girdiniz..");
        }

        // Cevap 2:
        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen gün ismini yaziniz..");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("Pazar")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Pazartesi")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Sali")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Carsamba")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Persembe")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Cuma")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Cumartesi")) {
            System.out.println(7);
        } else {
            System.out.println("Lutfen gecerli bir gun adi giriniz..");
        }

        //Cevap 3:
        Scanner input3 = new Scanner(System.in);
        System.out.println("Lutfen bir ay sayisi giriniz..");
        int month = input3.nextInt();

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println("Lutfen gecerli bir ay sayisi giriniz");
        }


    }
}
