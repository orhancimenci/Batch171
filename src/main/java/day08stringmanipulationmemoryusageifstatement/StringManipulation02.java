package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {

        // Ornek 1:  Bir stringin belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //           abc@gmail.com   ===> gmail

        String a = "abcdefghei@hotmail.com";

        int startingIndex = a.indexOf('@') + 1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);//companyName = gmail

        System.out.println("hard coding ==> " + a.substring(4, 9));

        //Ornek 2:Verilen iki string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);
        System.out.println(result);//false

        //_____________________________________________________________________________________________________________
        //Java da Memory kullanimi

        /*
        java da iki tane memory vardir
        1) "STACK Memory" ==> small
            a)Kucuk memorydir
            b)Primitive data ları ve Non-Primitivelerin "ADRESLERINI" (reference) tutar

        2) HEAP Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
              String, Wrapper, bizim olusturdugumuz classlar ...
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
        */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden "equals()" methodu kullaniriz?

        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikisi de ayni ise stringler esittir der. ama biz code yazarken genellikle Stringlerin adressleri ile degil,
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken "sadece degerlerine" bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der; ki bu bizim kod yazarken ihtiyac duyudugumuz seydir
        */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t);//false cunku adresler ve degerler farklidir
        System.out.println(s.equals(t));//false cunku degerler farkli
        System.out.println(s == r);//false cunku adresler farkli
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar
        // "s" ve "r" nin degerleri ayni oldugunda true verir
//___________________________________________________________________________________________________________________________
        // Ornek 3: Verilen iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan
        // kontrol eden kodu yaziniz
        // equalsIgnoreCase() iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eder

        String j = "ali Can";
        String k = "Ali Can";
        boolean result3 = j.equalsIgnoreCase(k);
        System.out.println(result3);//true

    }
}