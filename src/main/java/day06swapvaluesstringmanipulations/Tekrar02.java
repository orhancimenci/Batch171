package day06swapvaluesstringmanipulations;

public class Tekrar02 {
    public static void main(String[] args) {

        int a = 12;
        int b = 5;
        int sicaklik = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sicaklik = a;
        a = b;
        b = sicaklik;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
