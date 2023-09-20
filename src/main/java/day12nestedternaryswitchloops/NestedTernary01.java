package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Example 1: Verilen yilin "Artik Yil" (Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                   a) Yil 100'e bolunurse 400'e de bolunmelidir.  1600==>Leap    1800==>Leap degil
                   b) Yil 100'e bolunmuyorsa 4'e bolunmelidir.    2004==>Leap    2005==>Leap degil
        */

        int year = 2005;

        // c ? (c ? T : F) : (c ? T : F);

        String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not Leap") : (year % 4 == 0 ? "Leap" : "Not Leap");
        System.out.println(result);

        // NOTE: javada kodlarinizi yazarken nested yapilardan mümkün oldugunca uzak durmaliyiz
        //       Cunkü bu tarz yapilar uygulamayi yavaslatir (time consuming)

    }
}