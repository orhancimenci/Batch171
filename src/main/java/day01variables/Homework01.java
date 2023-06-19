package day01variables;

public class Homework01 {

    public static void main(String[] args) {

    //homework
        /*
        1) 3 farklı data turunda variable olusturun ve bunlari farkli satirlarda yazdirin
        2) Ulke ve sehir isimleri ıcın iki variable olusturun ve bunlari yazdirin
        3) Iki tamsayi turunde variable olusturup toplamini yazdirin
        */

    //Cevap 1:

    // 1) primitive data type: (ilkel-java olusturmustur)
    // char, boolean, byte, short, int, long, float, double

    // char: Tek karakterker icin kullanilir. Sayi, sembol ya da harf farketmez
    // boolean: lar sadece iki farkli deger alabilir; true (dogru) veya false (yanlis)
    // byte: tam sayilar icin kullanilir, hafizada 1 byte yer kaplar
    // short: tam sayilar icin kullanilir, hafizada 2 byte yer kaplar
    // int: tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
    // long: tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
    // Note: Bir deger long ise sonuna "L" (tavsiye edilir) veya "l" konulur
    // float: 4 byte yer kaplar, virgullu sayilar (Decimal Number => ondalikli sayilar) icin kullanilir
    // float olmasinda israr ediyorsaniz sonuna "F", "f" koymalisiniz
    // double: 8 byte yer kaplar, ondalikli kismi icin daha fazla rakam alabilir

    char kapiNumaram = 10;
    boolean isMarried = true;
    byte esiminYasi = 33;
    float ayakkabininFiyati = 319.99f;
    double atomAgirligi = 0.000012158796464568;

        System.out.println(kapiNumaram);
        System.out.println(isMarried);
        System.out.println(esiminYasi);
        System.out.println(ayakkabininFiyati);
        System.out.println(atomAgirligi);

    //Cevap 2:
    String ulkeIsmi = "Fransa";
        System.out.println(ulkeIsmi);
    String sehirIsmi = "Dubai";

    // Cevap 3:
    byte mevcutAy = 5;
    short mevcutYil = 2023;
        System.out.println(mevcutAy + mevcutYil);

}


}
