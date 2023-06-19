package day10ifstatements;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Pozitiftir..");
        } else if (num < 0) {
            System.out.println("Negatiftir..");
        } else {
            System.out.println("Notr..");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz..");
        byte num2 = input2.nextByte();

        if (num2 == 1) {
            System.out.println("Sunday");
        } else if (num2 == 2) {
            System.out.println("Monday");
        } else if (num2 == 3) {
            System.out.println("Tuesday");
        } else if (num2 == 4) {
            System.out.println("Wednesday");
        } else if (num2 == 5) {
            System.out.println("Thursday");
        } else if (num2 == 6) {
            System.out.println("Friday");
        } else if (num2 == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Hatali giris yaptiniz." +
                    "Lutfen 1 ile 7 arasinda bir sayi giriniz..");
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("Eyyy kullanici lutfen ay ismi giriniz..");
        String monthName = input3.next();

        if (monthName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Invalid month name..");
        }

        Scanner input4 = new Scanner(System.in);
        System.out.println("Yasini giriniz..");
        int age = input4.nextInt();

        if (age < 0) {
            System.out.println("Gecerli bir yas giriniz..");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas...");
        }


    }
}
