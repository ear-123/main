package main;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
    
        Hedgehog hedgehog = new Hedgehog();
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while (!exit) {

            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            
            

            String strininput = scan.nextLine();
            int option = 0;
            option = Integer.parseInt(strininput);

            if (option == 0) {
                System.out.println("Kiitos ohjelman käytöstä.");
                exit = true;
                continue;
            }
            if (option == 1) {
                System.out.println("Mitä siili sanoo:");
                hedgehog.speak(scan.nextLine());
                continue;
            }
            if (option == 2) {
                System.out.println("Anna siilin nimi:");
                String name = scan.nextLine();
                System.out.println("Anna siilin ikä:");
                int age = Integer.parseInt(scan.nextLine());
                hedgehog.newHedgehog(name, age);
                continue;
            }
            if (option == 3) {
                System.out.println("Kuinka monta kierrosta?");
                int laps = Integer.parseInt(scan.nextLine());
                hedgehog.run(laps);
                continue;
            }
            else {
                System.out.println("Syöte oli väärä");
                continue;
            }  
        } 
    }
}
