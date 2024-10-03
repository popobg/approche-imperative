package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        int userNumber = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Entrez un nombre entier compris entre 1 et 10 (inclus) :");

            // Le programme lève une exception si on saisit autre chose qu'un nombre.
            // On utilise un try-catch pour gérer ce cas d'erreur utilisateur.
            try {
                // récupère l'input utilisateur et le stocke comme un Int
                userNumber = scanner.nextInt();
            }
            catch(Exception InputMismatchException) {
                System.out.println("Ceci n'est pas un nombre.");
                System.out.println();
                scanner.nextLine();
            }
        } while (userNumber < 1 || userNumber > 10);

        System.out.printf("Vous avez choisi le nombre %s.", userNumber);
    }
}
