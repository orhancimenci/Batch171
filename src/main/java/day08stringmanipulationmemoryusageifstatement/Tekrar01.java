package day08stringmanipulationmemoryusageifstatement;

public class Tekrar01 {
    public static void main(String[] args) {
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);

        boolean result2 = str.isEmpty(); //Tercih edilir
        System.out.println("isEmpty? " + result2);

        String t = "          ";
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);

        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        boolean result5 = t.isBlank();
        System.out.println(result5);

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println(idxA + idxI + idxE);

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);

        int idxjava = u.indexOf("java");
        System.out.println(idxjava);

        String v = "Java is easy to learn";

        int idxOfa = v.lastIndexOf('a');
        System.out.println(idxOfa);

        int idxOfe = v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi = v.lastIndexOf('i');
        System.out.println(idxOfi);

        System.out.println(idxOfa + idxOfe + idxOfi);

        String a = "abc@gmail.com";

        int startingIndex = a.indexOf('@') + 1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);

        System.out.println("hard coding ==> " + a.substring(4, 9));

        String h = "ali can";
        String i = "Ali Can";

        boolean result = h.equals(i);
        System.out.println(result);

        String k = "Tom";
        String l = "Terry";
        String m = new String("Tom");

        System.out.println(k==l);
        System.out.println(k.equals(l));
        System.out.println(k==m);
        System.out.println(k.equals(m));






    }
}
