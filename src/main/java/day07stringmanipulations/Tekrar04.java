package day07stringmanipulations;

public class Tekrar04 {

    public static void main(String[] args) {

        String s = "     Ali Can    ";
        System.out.println(s);

        String kirpma = s.trim();
        System.out.println(kirpma);

        String isim = "   ali cAN    ";
        System.out.println(isim);

        char ilkHarf = isim.trim().toUpperCase().charAt(0);
        System.out.println(ilkHarf);

        char ikinciHarf = isim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(ikinciHarf);
        System.out.println("" + ilkHarf + ikinciHarf);

        String tv = "$456.99";
        String laptop = "$875.99";

        double toplamFiyat = Double.valueOf(tv.replace("$", "")) +
                Double.valueOf(laptop.replace("$", ""));
        System.out.println(toplamFiyat);


    }
}
