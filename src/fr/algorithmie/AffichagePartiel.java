package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 } ;

        System.out.print("Voici les entiers du tableau strictement supérieurs à 3 : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 3) continue;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Voici les entiers pairs du tableau : ");
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Voici les valeurs du tableau dont l'index est pair : ");
        // Alternative : for (int i = 0; i < array.length; i += 2)
        for (int i = 0; i < array.length; i ++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Voici les entiers impairs du tableau : ");
        // Alternative : for (int i = 1; i < array.length; i += 2)
        for (int i = 0; i < array.length; i ++) {
            // Comparaison à la valeur absolue pour prendre en compte
            // les nombres impairs négatifs également.
            if (Math.abs(array[i] % 2) == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
