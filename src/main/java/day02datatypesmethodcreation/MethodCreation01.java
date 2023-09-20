package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
       Java'da MethodOlusturma nasil olusturulur?

    1) main methodun disinda, classin icinde olusturulur

            1               2               3        4    5
    2) Access Modifier + Return type + Method ismi + () + {}
     */

    /*
    Olusturulan methodlar nasil kullanilir?
    1) Methodu olusturmak methodu calistirmak icin yeterli degildir. Kullanilmak istenen MethodOlusturma
        main MethodOlusturma un icinden kullanilir
    2) MethodOlusturma'un ismini yazacagiz + ()
    3) varsa islem yapacaginiz datalari parantezin icine koyun
        bu islem MethodOlusturma call (MethodOlusturma cagirma) olarak adlandirilir
    4) MethodOlusturma name + parametreler ==> MethodOlusturma signature
     */

    public static void main(String[] args) {

        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(5, 12);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2, 3, 4));

    }

    // Ornek1: toplama islemi yapan bir MethodOlusturma olusturunuz
    public static int toplamaYap(int a, int b) {
        //bu kısımda MethodOlusturma kapsaminda kullanilmasini ve islenmesini istedigim datalari deklare ediyoruz
        return a + b;
        //return demek bu methodu cagirildigi yere return et demek
        //main MethodOlusturma static oldugu icin main MethodOlusturma icinde kullanacagimiz MethodOlusturma static olmalidir

    }

    // Ornek 2: 2 sayiyi carpma islemi yapan bir MethodOlusturma olusturunuz
    protected static long multiply(int a, int b) {
        return a * b;
    }

    // Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayıi ile toplayan
    // methodu olusturunuz ve kullaniniz

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    /*
    public :     Projenin her tarafindan erisebilirsiniz
    protected:   Belirli bir grup ve o grubun cocuklarina acik demek
    default :    Belirli bir gruba acik demek
    private:     Sadece kisiye ozel

    public>protected>default>private
    NOT:Acces modifierlari classlar icin sececekseniz sadece public ve default secebilirsiniz,
    yani classlar protected veya private olamazlar
    */


}
