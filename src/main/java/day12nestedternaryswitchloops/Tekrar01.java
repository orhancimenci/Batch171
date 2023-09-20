package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        int year = 1600;

        // "c ? (c ? T : F) : (c ? T : F);"

        String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not Leap") : (year % 4 == 0 ? "leap" : "Not Leap");
        System.out.println(result);

        // nested (iç içe). iki kosullu yapilarda kullanilir.

        //-------------------------------------------------------------------------------------------------------------

        //Switch yapilar
        // " switch   case    System.out.println()    break   default "

        String dayName = "MondAy";

        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz..");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli ay nuamarasi giriniz..");
        }

        System.out.println("Iki sayi giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +,-,*,/,% dan birini giriniz..");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a % b / 100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir..");
        }

        System.out.println("Ulke adi giriniz..");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase().trim()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ülke tanimli degildir..");
        }

    }
}
