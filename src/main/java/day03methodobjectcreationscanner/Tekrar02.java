package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {

        //Class ismi + Object ismi + Assigment Operator + new keywordu + Constructor;
        Car myCar = new Car();

        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();

        System.out.println(aliCan.name);
        System.out.println(aliCan.adress);
        System.out.println(aliCan.grade);
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.adress = " + aliCan.adress);
        aliCan.study();
        aliCan.feed();

        Teacher mehmet = new Teacher();

        System.out.println(mehmet.isim);
        System.out.println(mehmet.age);
        mehmet.teach();

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..");


    }


}
