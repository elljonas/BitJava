package lt.jonas.app;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Labas, Pasauli!!");
        System.out.println("---------------------------------------");
        // Pasaulio gyventojų skaičius ir LT asmens kodas negali būti int tipo kintamieji JAVA kalboje,
        // nes skaiciai per dideli.
        // int worldPopulation = 7594000000;
        // int asmensKodas = 39008170660;

        //Java int kintamojo tipo max min reikšmės
        System.out.println("int Max reikšmė: " + Integer.MAX_VALUE);
        System.out.println("int Min reikšmė: " + Integer.MIN_VALUE);
        //Overflow reiškinys:
        System.out.println("Prie max int pridėjus \"1\", gaunama min reikšmė: ");
        System.out.println(Integer.MAX_VALUE + 1);
        //Underflow reiškinys:
        System.out.println("Iš min int atėmus \"1\", gaunama max reikšmė: ");
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println("---------------------------------------");
        //Asmens kodą galėtume saugoti string tipo kintamajame:
        String ak = "39008170660";
        //Bandymas atspausdinti gyventojų skaičių su daugybos veiksmu
        long sum;
        long worldPopulation = 759400000;
        sum = worldPopulation * 10;
        System.out.println("Gyventojų skaičius su long tipu, padauginta iš 10: " + sum);
        System.out.println("---------------------------------------");
        //5 padalinta iš 2 su operatorium %
        System.out.println("Panaudotas operatorius \"%\" dalinant 5 iš 2: " + (5%2));
        // // Dalybos veiksmas 2 / 0
        // System.out.println(2/0);  Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("---------------------------------------");
        //Skaidrėse buvo x=10 be kintamojo tipo :)
        int x = 10;
        int y = 5;
        System.out.println(x == 10 && y<=5); // true
        System.out.println(x <= y && y > 5); // false
        System.out.println("abc" instanceof String); //true
        System.out.println("---------------------------------------");
        //Teksto spausdinimas panaudojant vieną sout
        System.out.println("Sveiki, Jonai,\n- Kaip sekasi?");
        System.out.println("---------------------------------------");
        //String kintamojo manipuliavimas:
        String tekstas = "LoREM ipsum dolor sit amet, consectetur adipiscing elit";
        //Konvertuojmas visas stringas į mažąsias raides
        System.out.println(tekstas.toLowerCase());
        //Konvertuojmas visas stringas į didžiasias raides
        System.out.println(tekstas.toUpperCase());
        //Pakeičiamos raidės "o" su "z":
        System.out.println(tekstas.replace('o','z'));
        //Tikrinama ar stringas baigiasi žodžiu “elit”:
        System.out.println(tekstas.endsWith("elit"));
    }
}

