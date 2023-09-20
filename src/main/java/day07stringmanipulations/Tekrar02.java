package day07stringmanipulations;

public class Tekrar02 {
    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";

        //cevap1:
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        //cevap2:
        String t2 = t.replaceAll("[0-9a-zA-Z]", "!");
        System.out.println(t2);

        //cevap3:
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //cevap4:
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //cevap5:
        String t5 = t.replaceAll("[a-zA-Z]", "+");
        System.out.println(t5);

        //cevap6:
        String t6 = t.replaceAll("[^ ]", "?");
        System.out.println(t6);

        //cevap7:
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);


    }
}
