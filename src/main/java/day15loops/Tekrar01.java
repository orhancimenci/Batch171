package day15loops;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz..");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }

        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        int k =23;
        while (k>11){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();

        int a= 6;
        while (a<20){
            if (a%2!=0){
                System.out.print(a+" ");
            }
            a++;
        }
        System.out.println();

        System.out.println("Carpim tablosunu görmek icin bir sayi giriniz..");
        int num = input.nextInt();
        int r = 1;
        while (r<11){
            System.out.println(num+"x"+r+"="+(num*r));
            r++;
        }

        System.out.println("Bir kelime giriniz..");
        String word = input.next();
        String newWord = "";

        int w = 0;
        while (w < word.length()){
            newWord = newWord + word.charAt(w) + "*";
            w++;
        }
        System.out.println(newWord);































    }
}
