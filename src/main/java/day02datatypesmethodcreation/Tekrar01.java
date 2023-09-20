package day02datatypesmethodcreation;

public class Tekrar01 {
    public static void main(String[] args) {
        int sonuc = toplamaYap(3, 5);
        System.out.println("sonuc = " + sonuc);

        long carpmaSonucu = carpmaIslemi(7, 8);
        System.out.println("carpmaSonucu = " + carpmaSonucu);


    }

    // Ornek1: toplama islemi yapan bir MethodOlusturma olusturunuz
    public static int toplamaYap(int a, int b) {
        return a + b;
    }

    // Ornek 2: 2 sayiyi carpma islemi yapan bir MethodOlusturma olusturunuz
    public static int carpmaIslemi(int c, int d) {
        return c * d;
    }

    // Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayıi ile toplayan
    // methodu olusturunuz ve kullaniniz


}
