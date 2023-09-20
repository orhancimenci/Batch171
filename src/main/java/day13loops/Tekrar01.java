package day13loops;

public class Tekrar01 {
    public static void main(String[] args) {
        System.out.println("Hi");

        // a) for-loop b)while-loop c)do-while-loop d) fot-each loop

        // a) for - loop
        // i++ =>  i=i+1 =>  i+=1
        //      Baslangic degeri  ;       Loop calisma sarti   ;     Artirma/eksiltme
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi..!");
        }

        for (int i = 11; i < 15; i++) {
            System.out.print(i + "-");
        }
        System.out.println();

        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 18; i < 57; i++) {
            if (i % 2 != 1) {
                System.out.print(i + "-");
            }
        }
        System.out.println();

        for (int i = 21; i < 181; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + "-");
            }
        }
        System.out.println();

        String s = "ankara";
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
            }
        }
        System.out.println();

        String s2 = "Tramvay";
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (s2.charAt(i) == 'a')
                break;
            System.out.print(ch);
        }
        System.out.println();

        String t = "Germany";
        for (int i = t.length() - 1; i >= 0; i--) {
            if (t.charAt(i) == 'a') {
                break;
            }
            System.out.print(t.charAt(i));
        }
        System.out.println();

        String s3 = "Pwd12?Ab";
        for (int i = 0; i < s3.length(); i++) {
            char ch2 = s3.charAt(i);
            if (ch2 >= 'a' && ch2 <= 'z') {
                continue;//loop calismaya devam etsin demek
            }
            System.out.print(ch2);
        }

    }
}
