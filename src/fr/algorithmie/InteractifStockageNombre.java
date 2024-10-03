package fr.algorithmie;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        boolean play = true;
        int[] array = new int[1];
        boolean isFirstModif = true;

        System.out.println("Vous pouvez proposer des nombres entiers qui seront ajoutés à une liste.");

        while(play) {
            displayRules();
            int choice = Tools.getIntInput(1, 3);

            switch (choice) {
                case 1:
                    // Suivre ici le débuger
                    // Limites arbitraires
                    int userNumber = Tools.getIntInput(-600, 600);

                    if (isFirstModif) {
                        array[0] = userNumber;
                        isFirstModif = false;
                    }
                    else {
                        array = Arrays.copyOf(array, array.length + 1);
                        array[array.length - 1] = userNumber;
                    }
                    break;

                case 2:
                    if (isFirstModif) {
                        System.out.println("Aucun élément n'a été ajouté au tableau pour le moment.");
                    }
                    else {
                        Tools.displayArray(array, "");
                    }

                    // pause de 3sec après l'affichage du tableau ;
                    // lève une exception si interrompue pendant l'attente
                    // --> doit être gérée dans un "catch".
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;

                case 3 :
                    System.out.println("Fermeture du programme...");
                    play = false;
                    break;
            }
        }
    }

    public static void displayRules() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Voici les options proposées: ");
        System.out.println("1. Tapez 1 pour accéder au menu pour ajouter un nombre au tableau.");
        System.out.println("2. Tapez 2 pour afficher le tableau.");
        System.out.println("3. Tapez 3 pour quitter le programme.");
        System.out.println();
    }
}
