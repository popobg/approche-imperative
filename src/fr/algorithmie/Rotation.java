package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3 };

        int previousNumber = array[0];
        int intermediary;

        for (int i = 1; i < array.length; i ++) {
            if (i == array.length -1) {
                array[0] = array[i];
                array[i] = previousNumber;
            }
            else {
                intermediary = array[i];
                array[i] = previousNumber;
                previousNumber = intermediary;
            }
        }

        // Affiche le tableau modifié dans la console, à l'aide d'une fonction écrite
        // dans un exercice précédent.
        Tools.displayArray(array, "décalés d'un rang vers la droite");
    }
}
