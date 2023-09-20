package day05concatinationoperatorstypecasting;

public class Tekrar02 {
    public static void main(String[] args) {
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv + radio);

        int totalPrice = Integer.valueOf(tv.replace("$", "")) +
                Integer.valueOf(radio.replace("$", ""));
        System.out.println(totalPrice);//1400

        boolean ilk = 3 < 7;
        boolean ikinci = 2 + 3 != 5;
        boolean ucuncu = 2 + 3 * 5 >= 19;
        System.out.println(ilk + "-" + ikinci + "-" + ucuncu);

        System.out.println(ilk && ikinci);
        System.out.println(ilk || ikinci || ucuncu);

        byte yas = 13;
        int yasInt = yas;
        System.out.println(yas);
        System.out.println(yasInt);

        int agirlik = 123456;
        short agirlikS = (short) agirlik;
        System.out.println(agirlik);
        System.out.println(agirlikS);

        char a = 'a';
        System.out.println(a);

        int intA = 'a';
        System.out.println(intA);














    }
}
