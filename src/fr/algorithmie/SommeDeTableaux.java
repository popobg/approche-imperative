package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
        int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };

        int[] sumArray = new int[array1.length];

        for(int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Affiche les éléments du tableau résultant de la somme des deux premiers tableaux.
        // Nécessite l'import de la classe contenant la méthode statique.
        Tools.displayArray(sumArray, "sommé");
    }
}
