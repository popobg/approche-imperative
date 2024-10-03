package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, -1, 17, 2, 3, 0, 14, -4 };

        System.out.print("Eléments du tableau : ");
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Elements du tableau dans l'ordre inverse : ");
        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Entiers du tableau strictement supérieurs à 3 : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 3) continue;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Entiers pairs du tableau : ");
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Valeurs du tableau à l'index pair : ");
        // Alternative : for (int i = 0; i < array.length; i += 2)
        for (int i = 0; i < array.length; i ++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Entiers impairs du tableau : ");
        // Alternative : for (int i = 1; i < array.length; i += 2)
        for (int i = 0; i < array.length; i ++) {
            // comparaison à la valeur absolue pour prendre en compte
            // les nombres impairs négatifs également
            if (Math.abs(array[i] % 2) == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
