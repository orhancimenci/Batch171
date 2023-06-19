package day03methodobjectcreationscanner;

public class Homework03 {
    public static <print> void main(String[] args) {
           /*
           Homework
           1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
           2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
           */

        //Dairenin Çevresi = 2 x π x r
        double π = 3.14;
        int r = 7;

        double cevre = daireninCevresi(π,r);
        System.out.println("cevre = " + cevre);

        //Dairenin Alanı = π x r2
        alanHesapla(π,r);


    }

    private static void alanHesapla(double π, int r) {
        System.out.println("alan: "+π * r * r);
    }

    private static double daireninCevresi(double π, int r) {
        return 2 * π * r;
    }


}
