package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework01 {

    /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle
    diger harflerini kucuk harflerle console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz
    */
    public static void main(String[] args) {

        // Cevap 1:
        String str1 = "bunlar birer rakamdir: 0123456789";
        int karakterSayisi = str1.replaceAll("[0-9]", "").length();
        System.out.println("karakterSayisi = " + karakterSayisi);

        // Cevap 2:
        String str2 = "bunlar birer rakamdir";
        String buyukHarf = str2.substring(1, str2.length() - 1).toUpperCase();
        System.out.println(buyukHarf);

        // Cevap 3:
        String str3 = "Bunlar birer rakamdir";

        int asciiToplam = (str3.charAt(0)) +
                (str3.charAt(str3.length() - 1));
        System.out.println(asciiToplam);

        // Cevap 4:
        String str4 = "dEnİzLi";
        String sehirIsmi = str4.substring(0, 1).toUpperCase() +
                str4.substring(1).toLowerCase();
        System.out.println(sehirIsmi);

        // Cevap 5:
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String password = input.nextLine();

        boolean first = password.length() > 7;
        System.out.println("first= " + first);

        boolean third = password.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("third = " + third);

        boolean fourth = password.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourth = " + fourth);

        boolean fifth = password.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fifth = " + fifth);

        System.out.println("Password gecerli mi?\t" + (first && third && fourth && fifth));

    }
}
