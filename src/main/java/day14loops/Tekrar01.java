package day14loops;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        //tekrarli islem oldugu icin loop kullanmamiz gerektigini anliyoruz.
        String t = "Java";
        String ters = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);
        }
        System.out.println(ters);

        String u = "Java";
        String ters2 = "";
        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        String duz = "Ey edip adanada pide ye";
        String ters3 = "";

        for (int i = duz.length() - 1; i >= 0; i--) {
            ters3 = ters3 + duz.charAt(i);
        }
        System.out.println(ters3);

        if (duz.equalsIgnoreCase(ters3)) {
            System.out.println("Palindrome dur");
        } else {
            System.out.println("Palindrome degildir");
        }

        int sum = 0;
        for (int i = 5; i < 9; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int multiplay = 1;
        for (int i = 7; i < 10; i++) {
            multiplay = multiplay * i;
        }
        System.out.println(multiplay);

        int toplam = 0;
        int num = -123456789;
        num = Math.abs(num);

        for (int i = num; i > 0; i = i / 10) {
            toplam = toplam + i % 10;
        }
        System.out.println(toplam);

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz..");
        int start = input.nextInt();

        System.out.println("Bitis degeri giriniz..");
        int end = input.nextInt();

        if (start > end) {
            System.out.println("Baslangıc degeri bitis degerinden buyuk olmamali..");
        } else {
            for (int i = start; i < end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }
        }

        for (int i = 'd' / 'd'; i <= 'd'; i++) {
            System.out.print(i + " ");
        }

        for (int i = 1; i < 3; i++) {
            System.out.println("Week: " + i);
            for (int k = 1; k < 4; k++) {
                System.out.println("Day: " + k);
            }
        }

        // chatgpt cözümü
        int weeks = 2; // Toplam hafta sayısı
        int days = 7; // Her haftadaki gün sayısı

        for (int week = 1; week <= weeks; week++) {
            System.out.println("Week: " + week);

            for (int day = 1; day <= days; day++) {
                System.out.println("Day: " + day);
            }
        }

        System.out.println("Satir (rov) sayisini giriniz..");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz..");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int k = 1; k < column; k++) {
                System.out.println("X ");
            }
            System.out.println();
        }

        //nested loop lari java sevmez baska bir yöntemi varsa o kullanilir. en son secenek olmali

    }
}
