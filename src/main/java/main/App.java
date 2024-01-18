package main;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hedgehog siili = new Hedgehog("Pikseli", 5);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

           
            String choiceStr = sc.nextLine();

            try {
                int choice = Integer.parseInt(choiceStr);
                switch (choice) {
                    case 1:
                        System.out.print("Mitä siili sanoo:\n");
                        String text = sc.nextLine();
                        siili.speak(text);
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String newName = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        int newAge = Integer.parseInt(sc.nextLine());
                        siili = new Hedgehog(newName, newAge);
                        break;
                    case 3:
                        System.out.print("Kuinka monta kierrosta?\n ");
                        int kerrat = Integer.parseInt(sc.nextLine());
                        siili.run(kerrat);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        sc.close();
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                }
            } catch (NumberFormatException e) {
                System.out.println("Syöte oli väärä. Yritä uudelleen.");
            }
        }
    }
}