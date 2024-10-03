package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        // Initialisation d'un tableau de taille 10
        int[] intArray = new int[10];

        // Affectation des éléments du tableau
        for (int i = 0; i < 10; i++) {
            intArray[i] = i +1;
        }

        System.out.printf("Le premier élément du tableau est %s.%n", intArray[0]);
        System.out.printf("La longueur du tableau est de %s.%n", intArray.length);
        System.out.printf("Le dernier élément du tableau est %s.%n", intArray[intArray.length - 1]);

        // Modification d'un élément du tableau à l'aide de son index
        intArray[4] = 8;
        System.out.printf("Nouvel élément à l'index 4 : %s.", intArray[4]);
    }
}
