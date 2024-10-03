package fr.algorithmie;

public class Tools {
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
