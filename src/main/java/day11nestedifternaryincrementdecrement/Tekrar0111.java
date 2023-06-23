package day11nestedifternaryincrementdecrement;

public class Tekrar0111 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a = a + 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);

        int b = 10;
        System.out.println(b);
        b = b + 5;
        System.out.println(b);
        b += 5;
        System.out.println(b);

        int c = 8;
        System.out.println(c);
        c = c - 3;
        System.out.println(c);
        c -= 3;
        System.out.println(c);

        //--------------------------------------------------------------------------------------------------------------

        int d = 6;
        d = d * 2;
        d *= 2;

        int e = 24;
        e = e / 2;
        e /= 2;

        //--------------------------------------------------------------------------------------------------------------

        int f = 12;
        f += 1;
        f++;

        int h = 10;
        h = h - 1;
        h -= 1;
        h--;

        //--------------------------------------------------------------------------------------------------------------

        int i = 10;
        int k = (i++);

        int m = 15;
        int n = ++m;

        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;
        System.out.println(s);
        System.out.println(t);

    }
}
