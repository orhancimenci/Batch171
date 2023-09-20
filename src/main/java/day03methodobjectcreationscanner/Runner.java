package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {

        //"Object" nasil olusturulur

        //"New keywordu" sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor javada objeleri olusturmak icin kullanilan ozel bir methoddur
        //Class ismi + Object ismi + Assigment Operator + new keywordu + Constructor;
        Car myCar = new Car();

        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.fiyat = " + myCar.fiyat);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();

        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);

        aliCan.study();
        aliCan.feed();

        Teacher Mehmet = new Teacher();

        System.out.println("Mehmet.age = " + Mehmet.age);
        System.out.println("Mehmet.isim = " + Mehmet.isim);

        Mehmet.teach();


    }

}
