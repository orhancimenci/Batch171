package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir string ve iki integer variable olusturun.
        //         String degeri ile Integer larin toplamini console a yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b);  //elma1011 elma10+11 elma1011
        System.out.println(s + (a + b));//elma21 elma+21 elma21
        System.out.println(s + a * b);  //elma110 elma+110 elma110
        System.out.println(a + b + s);  //21elma 21+elma 21elma
        System.out.println(a + s + b);  //10elma11 10elma+11 10elma11

        // Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        // Java da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa "concatination"
        // islemi olur
        // "concatination" birlestirme yapar
        // Note : Concatination islemlerinde java matematik teki islem onceligi kurallarini kullanir

        /*
        Matematikte islem onceligi
        1) once uslu sayilar
        2) Parantez ici islemler yapilir
        3) Carpma ve Bolmeler yapilir
        4) Toplama ve cikarmalar yapilir
        5) Ayni oncelikli olanlarda "SOLDAN SAGA" baslanir
         */

        //Ornek 2: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String tshirt = "2300";
        String shoes = "5200";
        System.out.println(tshirt + shoes);//23005200

        // "Integer.valueOf()" string degerleri integer a cevirir

        int toplamFiyat = Integer.valueOf(tshirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv + radio);//$1100$300

        int totalPrice = Integer.valueOf(tv.replace("$",""))+
                Integer.valueOf(radio.replace("$",""));
        System.out.println(totalPrice);//1400

        //Note: valueOf() methodu tum karakterleri rakam olan String leri sayilara cevirir
        //Eger valueOf() methodu kullanilirken Stirng in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf() methoud kullanilirken sadece rakam olan karakterler kullanilmalidir.

    }

}