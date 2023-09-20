package day07stringmanipulations;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        String t = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        String t6 = t.replaceAll("[^ ]", "?");
        System.out.println(t6);

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String password = input.nextLine();
        //uygun bir MethodOlusturma secerek, kullanicinin girecegi datayi application ımın icine almam gerek

        boolean first = password.length() > 7;
        System.out.println("first= " + first);

        boolean second = !password.contains(" ");
        System.out.println("second = " + second);
        //"!" => not operator karsilastirma operatörlerinde (comparison operators)
        //"^" => regex icin olumsuzluk anlami verir

        boolean third = password.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("third = " + third);

        boolean fourth = password.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourth = " + fourth);

        boolean fifth = password.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fifth = " + fifth);

        System.out.println("Password gecerli mi?\t" + (first && second && third && fourth && fifth));

        String s = "   Ali Can   ";
        System.out.println(s);

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        String tvUcret = "$456.99";
        String laptopUcret = "$875.99";

        String tvUcret2 = tvUcret.replace("$", "");
        String laptopUcret2 = laptopUcret.replace("$", "");

        Double totalPrice = Double.valueOf(tvUcret2) + Double.valueOf(laptopUcret2);

        String name = "   ali cAN    ";
        char one = name.trim().toUpperCase().charAt(0);
        System.out.println(one);

        char two = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(two);

        System.out.println("" + one + two);

    }
}
