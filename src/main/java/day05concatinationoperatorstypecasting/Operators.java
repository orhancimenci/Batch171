package day05concatinationoperatorstypecasting;

public class Operators {
    /*
    1) +,-,*,/ islemleri  java da matematik te kullanildigi gibi kullanilir
    Note 1: int / int => int olur (yuvarlama yapmaz, virgülleri siler)
    Note 2: double + int ==> double olur (char < boolean < byte < short < int < long < float < double)
    Cunku; java da matematiksel islemlerde farkli data type lari kullanilirsa sonuc herzaman buyuk data tyepinda olur

    2) java da "Logical Operator" lar (mantiksal operatorler) vardir. AND ve OR islemleri Logical operatorlerdir
        i) AND (&&) isleminde true alabilmek icin her sey true olmalidir
           AND islemi "perfectionist" tir (mukemmeliyetcidir)
           AND isleminde bir tane  false sonucu false yapar

        ii)OR isleminde (||) bir tane true sonucu true yapmaya yeter
           OR isleminde sonucun false olmasi icin "hersey" false olmalidir
           OR islemi "polyanna" gibidir

        iii) NOT Operotor (!) true olani false, false olani true yapar
            !true   ==> false
            !false  ==> true
            !!true  ==> true

   3)Comparison (Karsilastirma) Operators
            <, >, <=, >=, ==, !=
    NOTE: Karsilastirma operatorlarini kullandiginizda kesinlikle "boolean (true veya false)" alirsiniz

    NOTE: Biz AND islemi icin "&&" kullaniriz ama & kullanimda gecerlidir
            Farklari nedir?
            && kullanim ilk ifade false oldugunda java digerlerini kontrol etmez, dolayisiyla hizli calisir
            cunku "and" isleminde ilk  ifade false ise digerlerinin ne oldugunun bir önemi yoktur, sonuc false olur
            & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayisiyla yavas calisir
            bu yuzden biz hep && kullaniriz
     */

    public static void main(String[] args) {
        boolean first = 3 < 5; //true
        boolean second = 2 + 3 != 5; //false
        boolean third = 2 + 3 * 5 >= 19; //false
        System.out.println(first + " - " + second + " - " + third); //true - false - false

        System.out.println(first && second); // false
        System.out.println(first || second || third); // true

    }
}