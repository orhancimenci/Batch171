package day03methodobjectcreationscanner;

// java nin "util kutuphanesi"nden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        // 1. adim Scanner Class tan "object" olustur.
        Scanner input = new Scanner(System.in);

        // 2. adim kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lütfen yasinizi giriniz");

        // 3. adim Uygun methodu kullanarak kullacinin verdigi datayi memory e yerlestiriniz.
        byte age = input.nextByte();

        System.out.println("age = " + age);


    }


}
