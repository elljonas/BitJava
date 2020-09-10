package lt.jonas.app;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Labas, Pasauli!!");
        System.out.println("---------------------------------------");
        System.out.println("----------Kintamųjų pratimai-----------");
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


        System.out.println("---------------------------------------");
        System.out.println("----------If'ų ir Ciklų pratimai-------");
        System.out.println("---------------------------------------");
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Your age, please: ");
        int age = Integer.parseInt(sc.nextLine());  // Read user input - laukia vartotojo įvesties ir enter paspausto
        // int num = sc.nextInt(); // This method reads the number provided using keyboard
        // sc.close(); // Closing Scanner after the use
        System.out.println("Your age is: " + age);  // Output user input
        // int age = 18;
        if (age < 18 ){
            System.out.println("Unfortunately, You can't vote");
        } else if ( age >= 18 && age < 45 ) {
            System.out.println("You can vote");
        }
            else if( age >=45 ){
                System.out.println("You can vote and to stand as a candidate");
            }
        System.out.println("---------------------------------------");
        int counter = 0;
        while(counter > 0){
            System.out.println("Niekada neįvykęs ciklas");
        }
        for (int i = 1; i < 0 ; i++) {
            System.out.println("Niekada neįvykęs ciklas");
        }
        System.out.println("---------------------------------------");
        // infinite loop
        // while(5>4){
        //     System.out.println("Niekada nesibaigia");
        // }
        // for( ; ; ){
        //     System.out.println("Labas");
        // }
        System.out.println("---------------------------------------");
        // ... Bandymai su raidės spėjimo pratimu:
        // Scanner sc1 = new Scanner(System.in);  // Create a Scanner object
        // System.out.print("Enter a letter, guess please: ");
        // // Read user input - laukia vartotojo įvesties ir enter paspausto
        // String letter1 = "q";
        // String letter;
        // while ((letter = sc1.nextLine()) != letter1){
        //     System.out.println("Your guess is: " + letter);
        //     System.out.println("Enter a letter, guess please: ");
        //     }
        // System.out.println("Yes, this letter!!!");

        // String n;
        // Scanner input = new Scanner(System.in);
        // while (true) { // Condition in while loop is always true here
        //     System.out.println("Input a letter, guess please: ");
        //     n = input.nextLine();
        //     if (n == "q") {
        //         System.out.println("Yes, this Letter!!");
        //         break;
        //     }
        //     System.out.println("---------------------------------------\nYou entered " + n);
        // }
        // .. veikiantis variantas
        Scanner sc1 = new Scanner(System.in);
        String userInput = null;
        String letter = "q";
        do {
            System.out.print("Please guess, enter a letter: ");
            userInput = sc1.nextLine();
        } while(!userInput.equals(letter)); // while userinput is not equal to letter, do x
        System.out.println("You are write! Letter is \"q\"");
        // ... reverse string in Java
        System.out.println("---------------------------------------");
        System.out.println("------- Reverse string in Java --------");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Please, enter the word: ");
        String userInput2 = sc2.nextLine();
        // String str = "alus";
        String reversedString = new StringBuffer(userInput2).reverse().toString();
        System.out.println(reversedString);
        System.out.println("---------------------------------------");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Įveskite tekstą arbą žodį: ");
        String userInput3 = sc3.nextLine();
        for (int i = 0; i < userInput3.length(); i++) {
            int k = i + 1;
            System.out.println("- " + userInput3.charAt(i) + " " + k);
        }
        System.out.println("---------------------------------------");
        System.out.println("----------Masyvų pratimai--------------");
        System.out.println("---------------------------------------");
        System.out.println("------------1 pratimas-----------------");
        int [] arr3Ciklai = { 2, 3, 5};
        for (int i = 0; i < arr3Ciklai.length; i++) {
            if(i == arr3Ciklai.length - 1){
                System.out.print(arr3Ciklai[i]);
            } else{
                System.out.print(arr3Ciklai[i] + ", ");
            }
        }
        System.out.println("\n----------2 ir 3 pratimas--------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Įveskite norimą masyvo dydį: ");
        int arrDydis = scan.nextInt();
        System.out.println(arrDydis);
        int[] kuriamasArr = new int[arrDydis];
        System.out.println("Įveskite masyvo elementus vienas po kito: ");
        for(int a = 0; a < arrDydis; a++) {
            kuriamasArr[a] = scan.nextInt();
        }
        System.out.println("Masyvas atrodo taip: " + Arrays.toString(kuriamasArr));
    }
}
