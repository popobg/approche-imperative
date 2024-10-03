package fr.algorithmie;

import java.util.HashSet;
import java.util.Set;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
        int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

        // On peut utiliser le type Set pour stocker les chiffres en commun ;
        // cela permet d'éviter qu'un chiffre en double dans le tableau
        // soit compter deux fois.
        // redundancy serait alors égal à set.size().
        Set<Integer> commonNumber = new HashSet<Integer>();
        int redundancy = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    redundancy += 1;
                    // Le chiffre n'est pas ajouté s'il est déjà présent dans le set.
                    commonNumber.add(array1[i]);
                }
            }
        }

        System.out.printf("Il y a %s éléments en commun entre les deux tableaux.", redundancy);
    }
}
