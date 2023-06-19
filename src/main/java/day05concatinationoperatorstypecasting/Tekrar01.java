package day05concatinationoperatorstypecasting;

public class Tekrar01 {
    public static void main(String[] args) {

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);  //elma1011
        //concatination: birlestirme
        System.out.println(s + (a + b));//elma21
        System.out.println(s + a * b);  //elma110
        System.out.println(a + b + s);  //21elma
        System.out.println(a + s + b);  //10elma11

        String fiyat1 = "2300";
        String fiyat2 = "5200";
        System.out.println(fiyat1 + fiyat2); //23005200

        int toplamFiyat = Integer.valueOf(fiyat1) + Integer.valueOf(fiyat2);
        System.out.println(toplamFiyat);

        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv + radio); //$1100$300

        int totalPrice = Integer.valueOf(fiyat1) + Integer.valueOf(fiyat2);
        System.out.println(totalPrice);

        byte age = 12;
        int ageInt = age;


    }
}
