package day08stringmanipulationmemoryusageifstatement;

public class Tekrar02 {
    public static void main(String[] args) {

        String str = "";
        boolean sonuc1 = str.length() == 0;
        System.out.println("String bos mu = " + sonuc1);

        boolean sonuc2 = str.isEmpty();
        System.out.println("Bos mu = " + sonuc2);

        String t = "";
        boolean sonuc3 = t.replace(" ", "").length() == 0;
        System.out.println(sonuc3);

        boolean sonuc4 = t.replace(" ", "").isEmpty();
        System.out.println(sonuc4);

        boolean sonuc5 = t.isBlank();
        System.out.println(sonuc5);

        String r = "Java is easy to learn";
        int dizinA = r.indexOf('a');
        int dizinI = r.indexOf('i');
        int dizinE = r.indexOf('e');
        System.out.println(dizinA + dizinI + dizinE);

        String u = "Ah Jav vah Java sensiz olmuyor Java.";
        int dizinJava = u.indexOf("Java");
        System.out.println(dizinJava);

        int dizinjava = u.indexOf("java");
        System.out.println(dizinjava);

        String v = "Java is easy to learn";

        int dizinOfa = v.lastIndexOf('a');
        int dizinOfe = v.lastIndexOf('e');
        int dizinOfi = v.lastIndexOf('i');

        System.out.println(dizinOfa + dizinOfe + dizinOfi);


    }
}
