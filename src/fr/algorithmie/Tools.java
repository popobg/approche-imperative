package fr.algorithmie;

import java.util.Scanner;

public class Tools {
    /**
     * Fonction statique qui affiche dans la console une phrase d'introduction
     * avec le nom du tableau, ainsi que les éléments du tableau
     * du premier au dernier index.
     * @param array : tableau d'entiers à parcourir.
     * @param name : String correspondant au nom du tableau,
     *             qui sera utilisée dans la phrase introductive.
     */
    public static void displayArray(int[] array, String name) {
        System.out.printf("Voici les éléments du tableau %s : ", name);
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    /**
     * Fonction statique qui demande à l'utilisateur de saisir un chiffre
     * entre 1 et 10 (inclus) dans la console.
     * @return int : retourne le nombre choisi par l'utilisateur.
     */
    public static int getIntInput() {
        int userNumber = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Entrez un nombre entier compris entre 1 et 10 (inclus) :");

            try {
                userNumber = scanner.nextInt();
            }
            catch(Exception InputMismatchException) {
                System.out.println("Ceci n'est pas un nombre entier.");
                System.out.println();
                scanner.nextLine();
            }
        } while (userNumber < 1 || userNumber > 10);

        return userNumber;
    }
}
