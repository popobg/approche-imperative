package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = { -1, 15, -3, 1, 8, 7, 4, 1 };

        boolean SameFirstAndLastDigit = false;

        if (array.length > 0 && (array[0] == array[array.length - 1])) {
            SameFirstAndLastDigit = true;
        }

        if (SameFirstAndLastDigit) {
            System.out.printf("VRAI : le premier et dernier élément du tableau sont identiques, c'est un %s.", array[0]);
        }
        else {
            System.out.print("FAUX : le premier et dernier élément du tableau ne sont pas identiques.");
        }
    }
}
