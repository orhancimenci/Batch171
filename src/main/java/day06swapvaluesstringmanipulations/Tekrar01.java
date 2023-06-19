package day06swapvaluesstringmanipulations;

public class Tekrar01 {
    public static void main(String[] args) {

        //1. yol
        int a = 12;
        int b = 5;
        int temp = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2. yol
        int elma = 12;
        int armut = 5;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma + armut;
        armut = elma - armut;
        elma = elma - armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        String s = "Java is easy";

        String sUpper = s.toUpperCase();//buyuk harf yapar
        System.out.println(sUpper);

        String sLower = s.toLowerCase(); //kucuk harf yapar
        System.out.println(sLower);

        char firstChar = s.charAt(0); //istedigimiz sıradaki karakteri getirir
        System.out.println(firstChar);

        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);

        int sLenght = s.length(); //karakterleri sayma
        System.out.println(sLenght);

        String sub1 = s.substring(0, 4); //arasi karakterleri alma
        System.out.println(sub1);

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);
        //2. yol
        String sub4 = s.substring(8);
        System.out.println(sub4);

        boolean isExist = s.contains("money"); //var olup olmadigini kontrol etme
        System.out.println(isExist);

        boolean isStart = s.startsWith("Java"); //baslayip baslamadigini kontrol eder
        System.out.println(isStart);

        boolean isBegin = s.startsWith("i", 5); //belirli bir karakterden itibaren
        System.out.println(isBegin);

        String p = "Learn Java earn money"; //bitip bitmedigini soruyoruz
        boolean isEnd = p.endsWith("money");

        String p1 = p.replace("money", "dollar"); //bir karakteri degistirmesini istiyoruz
        System.out.println(p1);

        String p2 = p.replace("earn", "win");
        System.out.println(p2);

        String p3 = p.replace('a', '*');
        System.out.println(p3);

        String p4 = p.replace("n", "xxx");
        System.out.println(p4);

        String p5 = p.replace("e", "");
        System.out.println(p5);

        String t = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

    }
}
