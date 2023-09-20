package day13loops;

public class Tekrar02 {
    public static void main(String[] args) {

        for (int i = 50; i > 15; i -= 5) {
            System.out.print(i + "-");
        }
        System.out.println();

        for (int i = 18; i < 56; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "-");
            }
        }
        System.out.println();

        String s = "ankara";
        String ch = s.substring(1, 2);
        System.out.println(ch);
















    }
}
