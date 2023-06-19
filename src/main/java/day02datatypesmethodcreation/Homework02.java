package day02datatypesmethodcreation;

public class Homework02 {

/*
    1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
    2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
    */

    //Cevap:

    public static void main(String[] args) {

        int en = 4;
        int boy = 7;

        int alan = alanHesapla(en, boy);
        System.out.println("Dikdötgenin Alani: " + alan);

        int cevre = cevreHesapla(en, boy);
        System.out.println("Dikdörtgenin Cevresi: " + cevre);
    }

    public static int cevreHesapla ( int en, int boy){
        return 2 * (en * boy);
    }

    public static int alanHesapla( int en, int boy){
        return en * boy;
    }


}