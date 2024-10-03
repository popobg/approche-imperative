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
        Plutôt que de réécrire deux fois la boucle pour afficher le tableau,
        j'ai préféré écrire une fonction.
        Je l'ai créée statique pour pouvoir l'appeler sans créer d'instance d'objet.
         */
        DisplayArray(array, "initial");
        DisplayArray(arrayCopy, "inversé");
    }

    /**
     * Fonction statique qui affiche dans la console une phrase d'introduction
     * avec le nom du tableau, ainsi que les éléments du tableau
     * du premier au dernier index.
     * @param array : tableau d'entiers à parcourir.
     * @param name : String correspondant au nom du tableau,
     *             qui sera utilisée dans la phrase introductive.
     */
    public static void DisplayArray(int[] array, String name) {
        System.out.printf("Voici les éléments du tableau %s : ", name);
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
