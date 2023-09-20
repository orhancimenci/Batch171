package day06swapvaluesstringmanipulations;

public class Tekrar03 {
    public static void main(String[] args) {

        String s = "Java is easy";

        //cevap1:
        String sBuyukHarf = s.toUpperCase();
        System.out.println(sBuyukHarf);

        //cevap2:
        String sKucukHarf = s.toLowerCase();
        System.out.println(sKucukHarf);

        //cevap3:
        char ilkKarakter = s.charAt(0);
        System.out.println(ilkKarakter);

        //cevap4:
        char ikinciKarakter = s.charAt(1);
        char sondanIkinciKarakter = s.charAt(10);
        System.out.println("" + ikinciKarakter + sondanIkinciKarakter);

        //cevap5:
        int sUzunluk = s.length();
        System.out.println(sUzunluk);

        //cevap6:
        String altDizi1 = s.substring(0, 4);
        System.out.println(altDizi1);

        //cevap7:
        String altDizi2 = s.substring(8, 10);
        System.out.println(altDizi2);

        //cevap8:
        String altDizi3 = s.substring(7, 12);
        System.out.println(altDizi3);

        //ikinciyol:
        String altDizi4 = s.substring(7);
        System.out.println(altDizi4);

        //cevap9:
        boolean icerirMi = s.contains("money");
        System.out.println(icerirMi);

        //cevap10:
        boolean baslarMi = s.startsWith("Java");
        System.out.println(baslarMi);

        //cevap11:
        boolean baslarMi2 = s.startsWith("e", 8);
        System.out.println(baslarMi2);

        String m = "Learn Java earn money";

        //cevap1:
        boolean biterMi = m.endsWith("money");
        System.out.println("biterMi = " + biterMi);

        //cevap2:
        String m1 = m.replace("money", "dollar");
        System.out.println(m1);

        //cevap3:
        String m2 = m.replace("earn", "win");
        System.out.println(m2);

        //cevap4:
        String m3 = m.replace('a', '*');
        System.out.println(m3);

        //cevap5:
        String m4 = m.replace("n", "xxx");
        System.out.println(m4);

        //cevap6:
        String m5 = m.replace("e", "");
        System.out.println(m5);

        //cevap7:
        String t = "Ali 13 yasindadir!...";
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        String t2 = t.replaceAll("[a-zA-Z]", "-");
        System.out.println(t2);

    }

}

