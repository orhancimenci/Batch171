package day02datatypesmethodcreation;
//projects, packace ve java class isimlerini Refactor ==> Rename den degistire biliyoruz
public class Variables01 {

    //Variable: resort area, konteyner, depolanan islenen bilgileri koydugumuz yerdir, alandır, kutudur, pasif özelliklerdir
    //datalarımızı saklamak icin kullandıgımız kutudur

    //entry-point class imizin motorudur
    public static void main(String[] args) {

        //Ornek 1:Sehir ismi icin bir variable olusturun ve once "Ankara" sonra da "Izmir degeri atayip ekrana yazdirin
        String cityName = "Ankara"; //string kavanozuna veri koymak icin tırnak konulur
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println(cityName);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun ve once "06" sonra da "35 değeri atayıp ekrana yazdırın
        byte plakaKodu = 06;
        System.out.println(plakaKodu);

        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonra da "true" degeri atayip ekrana yazdirin
        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);

    }


}
