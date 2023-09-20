package day03methodobjectcreationscanner;

public class Tekrar01 {
    public static void main(String[] args) {
        double kup = kupunuAl(7);
        System.out.println("kup = " + kup);

        print("Java kolaydir");

        String str = "TechproEdu";
        printConsole(str);

        String ogrenme = "Orhan Java ogrenmekte..";
        printSatir(ogrenme);

        int x = 4;
        int y = 7;
        carpYazdir(x, y);

        int k = 7;
        int l = 9;
        carpYazdir(k, l);

        int sayi = 5;
        karesiniAl(sayi);

        int p = 9;
        karesiniAl(p);

    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi * sayi);
    }

    private static void carpYazdir(int x, int y) {
        System.out.println(x * y);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }

    private static void printSatir(String ogrenme) {
        System.out.println(ogrenme);
    }

    static double kupunuAl(double a) {
        return a * a * a;
    }

    public static void print(String str) {
        System.out.println(str);
    }


}
