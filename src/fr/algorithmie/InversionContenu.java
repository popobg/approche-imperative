package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 } ;

        // Création d'une copie du tableau dont l'ordre est inversé
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[(array.length - 1) - i];
        }

        /*
        Plutôt que de réécrire plusieurs fois la boucle pour afficher le tableau,
        j'ai préféré écrire une fonction contenue dans une classe Tools.
        Cette fonction est statique pour pouvoir l'appeler sans créer d'instance d'objet.
         */
        Tools.displayArray(array, "initial");
        Tools.displayArray(arrayCopy, "inversé");
    }
}
