package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] numbers = { 8, -7, 12, 1, -2, 14, 17, 9 };

        System.out.println("premier élément du tableau \"numbers\" : " + numbers[0]);
        System.out.println("Taille du tableau : " + numbers.length);
        System.out.println("Dernier élément du tableau : " + numbers[numbers.length - 1]);

        /*
        ArrayIndexOutOfBoundsException : l'exception suivante survient à la compilation.
        "Index 10 out of bounds for length 8" indique le message d'erreur.
        Cela signifie que l'on cherche à accéder à un élément inexistant du tableau, qui n'est pas dans ses limites :
        index minimum = 0, maximum = 7 pour notre tableau.
         */
        System.out.println("Afficher un élément inexistant du tableau : " + numbers[10]);
    }
}
