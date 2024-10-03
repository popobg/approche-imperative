package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        int userNumber = 0;
        Scanner scanner = new Scanner(System.in);

        while (userNumber <= 1) {
            System.out.println("Entrez un nombre entier positif :");
            try {
                userNumber = scanner.nextInt();
            }
            catch(Exception InputMismatchException) {
                System.out.println("Ceci n'est pas un nombre entier.");
                System.out.println();
                scanner.nextLine();
            }
        }

        int sum = 0;

        for (int i = 1; i <= userNumber; i++) {
            sum += i;
        }

        System.out.printf("La somme de tous les entiers de 1 à %s est %s.", userNumber, sum);
    }
}
