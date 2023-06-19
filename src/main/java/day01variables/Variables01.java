package day01variables;

public class Variables01 {

    //Projenin ismi Batch171
    //Package olusturduk    day01variables
    //Class oluşturduk      Variables01
    /*Projenin icinde birden fazla package olur. Package lerin icerisinde de bir sürü class olur.
    Bunlarin toplami da projeyi oluşturur
     */
    //Class isimleri her zaman BÜYÜK harfle başlar
    //Package isimleri de tamamen küçük harflerden oluşur
    //Main Method kısayolla oluşturabilmek için main veya psvm yazıp enter a basmak yeterli
    //Main methodla motorumuzu oluşturmuş olduk

    public static void main(String[] args) {

        //Java bu satırları okumaz, kendimize ve başkalarına açıklama satırıdır kısaca comment satırı
        /*
        Java bu satırları da okumaz
         */


        //Variable pasif özelliklerdir. Variable dataları saklamak için kullandığımız kutu/konteynırdır
        /*
        Programımızın çalışması esnasında geçici olarak bazı dataları
        depolayabileceğimiz ve değiştirebileceğimiz değerlerdir
         */
        //Java ya kelime Ali, tam sayı 5 demek gerekiyor
        //Yani Variables oluştururken:
        //Data type + variable name + Assigment Operatör (atama operatörü) + Variable değeri + noktalı virgül
        int               age                 =                                   13                ;
        //Variable Declaration (int age)  =  Assignment (=13;)


        // Java cümlesi statement olarak adlandırılır
        // Dil bilgisindeki nokta ne ise Java daki noktalı virgül aynı şeydir, yani statement in bittiğini gösterir
        // Eğer variable declaration yapar Assignment yapmazsanız java kendi default değerini koyar
        // Default değer sayılar için sıfırdır.
        // Java da "=" assignment operator dır ve java bu operatörü gördüğü zaman önce sağ tarafı çalışrırır.
        // ve sağdaki değeri alır soldaki kutuya koyar
        // Java da esittir demek "==" matematikte "=" dir.
        // Data Type + VariableName                  ==> Variable decleration
        // Assigment Operatör (=) + Variabel Degeri  ==> Assigment


        /*
        Java da temelde iki tip data vardir

            1) primitive data type: (ilkel-java olusturmustur)
                char, boolean, byte, short, int, long, float, double
            2) non-primitive data type:
                String,
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Data type + variable name + Assigment Operatör (atama operatörü) + Variable değeri + noktalı virgül
        String         ogrenciAdi               =                                  "Ali Can"          ;

        //String lere verilen degerler daima cift tırnak icinde yazilmalidir
        //String ler icin "default value" (varsayilan deger) "null" dir
        /*
        String bir variable olsuturdugumuzda cogu zaman ona bir deger atariz. Atama yapmazsak, java o variable a
        varsayilan deger olarak null koyar
        - null demek 0 demek degildir, 0 da coding bir degerdir, null hiclik demektir
        - icinde variable ya da method bulunmayan bos bir obje demektir
        - {}==> eleman yok     {0}==> elemani sifir
        */



        // char data type
        // Tek karakterker icin kullanilir. Sayi, sembol ya da harf farketmez
        // Ornegin ==> A, x, ?, 5, ...
        // Ornek 2: char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A' ;
        char cocugumunYasi = '2' ;
        char unlemIsareti = '!' ;

        //Note: char data type inda degerler daima tek tirnak icinde yazilmalidir

        // boolean data type:
        // boolean lar sadece iki farkli deger alabilir; true (dogru) veya false (yanlis)
        // o yuzden isimlendirme yapilirken ingilizce olarak mi soru eki anlamında basina is konulur.
        //Ornek 3: boolean data tipinde emekli misin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetired = false;
        boolean emekliMisin = false;

        // byte data type
        // tam sayilar icin kullanilir, hafizada 1 byte yer kaplar
        // byte : -128 den +127 e (dahil) kadar tam sayi degerler icin kullanilir

        // Ornek 4: byte data tipinde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 18;

        //short data type
        //tam sayilar icin kullanilir, hafizada 2 byte yer kaplar
        //short: -32768 den +32767 e (dahi kadar tamsayi degerleri icin kullanilir

        //Ornek 5: Sıte nufusu icin bir variable olusturup deger atayiniz
        short siteNufusu = 1300;

        //int data type
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 (dahi kadar tamsayi degerleri icin kullanilir

        //Ornek 6: Ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz
        int ulkeNufusu = 131313131;

        //long data type
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 (dahi kadar tamsayi degerleri icin kullanilir

        //Ornek 7: Insan vucudundaki hucre sayısı icin variable olusturup deger ataması yapiniz
        //Note: Bir deger long ise sonuna "L" (tavsiye edilir) veya "l" konulur
        long cellNumberInHumanBody = 123456789123456789L;

        //Note: Eger long a atadiginiz deger int lerin araliginde ise sonuna "L" koymaya gerek yok
        //Long demenize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long weightOfSun = 123456789;

        //float data type: 4 byte yer kaplar
        //float virgullu sayilar (Decimal Number => ondalikli sayilar) icin kullanilir
        //fiyatlandirmalar - 12.99)

        //Ornek 8: Gomlek ve ayakkabi fiyatlari iciniki tane variable olusturun

        //Java ondalikli sayilari otomatik olarak "double" kabul eder
        //Siz data type ini float yazarsaniz hata alirsiniz, float olmasinda israr ediyorsaniz sonuna "F", "f" koymalisiniz
        float shirtPrice = 12.99F;
        float shosePrice = 15.99f;

        //double data type: 8 byte yer kaplar
        //ondalikli kismi icin daha fazla rakam alabilir. Hucre agirligi gibi bilimsel calismalarda kullanilabilir

        //Ornek 9: Hucre agirligi ve Amip in agirligi icin iki tane variable olusturunuz

        double weifthCell = 0.000000000000000013;
        double weifthAmip = 0.0000000000000003;

        //Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz
        byte note1 = 50;
        byte note2 = 70;

        //System.out.println(); Ekrana yazdirir
        System.out.println(note1);
        System.out.println(note2);

        System.out.println(note1+note2);

        //--------ekrana yazdirmak icin------------
        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira kayar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar
        //-----------------------------------------



    }





}

