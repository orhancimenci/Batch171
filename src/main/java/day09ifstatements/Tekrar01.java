package day09ifstatements;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        //Note: Bir string de son index her zaman "length()-1" olur

        int number = -123;
        number = Math.abs(number);

        if (99<number && number<1000) {
            System.out.println("Sayi uc basamaklidir!");
        }

        String str ="aac";

        char ch1=str.charAt(0);
        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2=str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3=str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num= input.nextInt();

        // 1. Yol:
        if(num%2==0){
            System.out.println("Cift sayi...");
        }

        if (num%2!=0){
            System.out.println("Tek sayi...");
        }

        // 2. Yol:
        if (num%2==0){
            System.out.println("Cift sayi...");
        }else {
            System.out.println("Tek sayi...");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz...");
        char ch = input2.next().charAt(0);

        // 1. Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf...");
        }
        if (ch>='a'&& ch<='z'){
            System.out.println("Kucuk harf...");
        }

        // 2. Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf...");
        }else if (ch>='a'&& ch<='z'){
            System.out.println("Kucuk harf...");
        }




    }
}
