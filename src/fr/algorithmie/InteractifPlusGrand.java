package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        // Enregistre le nombre de fois que l'ordinateur a demandé un chiffre
        //  à l'utilisateur.
        int count = 0;
        int max = 0;
        int userNumber;
        Scanner scanner = new Scanner(System.in);

        while (count < 10) {
            System.out.printf("Vous avez entré %s nombre(s).%n", count);
            System.out.println("Entrez un nombre entier :");

            try {
                userNumber = scanner.nextInt();
                if (count == 0) {
                    max = userNumber;
                }
                else if (userNumber > max) {
                    max = userNumber;
                }
                count++;
            }
            catch(Exception InputMismatchException) {
                System.out.println("Ceci n'est pas un nombre entier.");
                System.out.println();
                scanner.nextLine();
            }
        }

        System.out.printf("Le plus grand chiffre que vous avez rentré est %s.", max);
    }
}
