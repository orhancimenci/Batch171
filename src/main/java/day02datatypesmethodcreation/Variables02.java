package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Javada temelde 2 tip data vardır
        1) primirive data type: (ilkeldir)
            char, boolean, byte, short, int, long, flat, double
        2) non-primitive data type:
            String
     */

    /*
    Note 1: primitive data type'larini java olusturmustur, biz olusturamayiz
    Note 2: primitive data typelarinin isimlerinde sadece kücük harf kullanilir
    Note 3: primitive datalar data typelarına göre memory de farkli farkli yer kaplarlar
    Note 4: primitive datalar iclerinde SADECE sizin atadığınız degeri barindirirlar
     */

        /*
        Non-primitive data types
        Ornek => String ...
            * Uretilen her bir class ayni zamanda non-primitive data typedir
            Bu yuzden non-primitive data type lar sinirsiz sayidadir denilebilir
            * Non-primitive data typeların isimleri Büyük Harf ile baslar
            * Non-primitiveler icin java, memory de büyüklügüne göre degisen boyutlarda yer ayirir
         */

    public static void main(String[] arg) {
        //Ornek: Ulke ismi icin bir variable olusturun ve ekrana yazdirin
        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);

        //Memory de bir alan rezerve edildi
        //ulkeIsmi adında bir sepet olustu
        //kavanoz olusturuk. icindeki "null" ı sildik. "Turkiye" yaptık ==> Variable koyduk ==> pasif özellik
        //sepetimizin icinde aktif özellikler de var ==>method

        //method örnek:
        //Turkiye ==> TURKIYE => tum karakterleri buyuk harfe dönusturen method var
        //Turkiye ==> 7       => karakterlerin sayisini veren method var


        /*
        Interview sorusu: "primitive" ve non-primitive" data typeları arasindaki fark nedir?
        1) "primitive"ler sadece bizim atadigimiz degerleri icerir
            "non-primitive"ler bizim atadigimiz degerleri ve methodlari icerir
        2) "primitive"ler kücük harfle baslar
            "non-primitive"ler buyuk harfler baslar
        3) "primitive"leri java üretmistir ve 8 tanedir
            "non-primitive"leri java ve developerlar üretebilir ve sinirsiz sayidadir
        4) "primitive" ler memory de data typle larina gore sabit boyutta bellek kullanir
            "non-primitive"ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler
         */


    }


}
