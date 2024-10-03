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
     * dans la console, compris dans les limites données en paramètres.
     * @param min : un entier constituant la limite minimale autorisée.
     * @param max : un entier constituant la limite maximale autorisée.
     * @return int : retourne le nombre choisi par l'utilisateur.
     */
    public static int getIntInput(int min, int max) {
        int userNumber = min - 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Entrez un nombre entier compris entre %s et %s (inclus) :%n", min, max);

            try {
                userNumber = scanner.nextInt();
            }
            catch(Exception InputMismatchException) {
                System.out.println("Ceci n'est pas un nombre entier.");
                System.out.println();
                scanner.nextLine();
            }
        } while (userNumber < min || userNumber > max);

        return userNumber;
    }
}
