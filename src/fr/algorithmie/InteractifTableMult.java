package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        /*
        Comme nous l'utilisons dans plusieurs programmes,
        j'ai créé une fonction getIntInput qui récupère le nombre
        de l'utilisateur. Cela permet de me faire gagner du temps
        et diminue la quantité de code d'un fichier.
         */
        int userNumber = Tools.getIntInput();

        /*
         On pourrait faire avec if/else mais c'est très redondant et peu optimisé.
         Tant que les tables se limitent de 1 à 10, cela reste gérable,
         mais au-delà le programme serait beaucoup trop long et fastidieux à écrire
         pour envisager toutes les possibilités.
         */
        displayMultiplicationTable(userNumber);
    }

    public static void displayMultiplicationTable(int number) {
        System.out.printf("Table de %s :%n", number);

        for (int i = 1; i < 11; i ++) {
            System.out.printf("%s * %s = %s%n", number, i, i * number);
        }
    }
}
