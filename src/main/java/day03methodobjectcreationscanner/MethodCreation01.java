package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        double kup = getCube(5);
        //MethodOlusturma call yaptık. MethodOlusturma da return yapti.
        System.out.println("kup = " + kup);

        print("Java is easy");

        //MethodOlusturma olusturmak icin 2. yol
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir MethodOlusturma olusturup kullaniniz.
        //main MethodOlusturma icinde iken MethodOlusturma ta kullanilacak olan variable lari olusturunuz
        String str = "TechproEdu";
        //MethodOlusturma ismi ve parametreleri yazariz
        //kirmizi kismin uzerinde bekleyip create MethodOlusturma a tiklariz intellij otomatik olarak bir MethodOlusturma olusturur
        //daha sonra kendi istegimize gore dizayn ederiz
        printConsole(str);
        String ogrenme = "Orhan Java Ogreniyor";
        printSatir(ogrenme);

        //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        int a = 3;
        int b = 5;
        carpmaYap(a, b);
        //Tekrarda yapilan bir ornek:
        int x = 7;
        int y = 9;
        carpmaYap(x, y);


        //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
        int sayi = 5;
        karesiniAl(sayi);

    }

    private static void carpmaYap(int x, int y) {
        System.out.println(x * y);
    }


    public static void printSatir(String ogrenme) {
        System.out.println(ogrenme);
    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi * sayi);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir MethodOlusturma olusturup kullaniniz.

    static double getCube(double a) {
        return a * a * a;
    }
    //Note: Access modifier i "default" yapmak isterseniz access modifier i YAZMAYINIZ..
    //Method, Class ın icinde main MethodOlusturma un disinda olusturulur

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir MethodOlusturma olusturup kullaniniz
    public static void print(String str) {
        System.out.println(str);
    }
    //Eger bir MethodOlusturma yeni bir data uretmiyor ise "return type" i "void" olur.
    //methodun return type i void ise MethodOlusturma body icinde return keywordu yazilmaz.

}