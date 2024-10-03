package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 6, 8, 7, 4, -6 };

        boolean firstOrLast6 = false;

        if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
            firstOrLast6 = true;
        }

        if (firstOrLast6) {
            System.out.println("VRAI : le tableau comporte un 6 en première et/ou en dernière position.");
        }
        else {
            System.out.println("FAUX : le tableau ne comporte pas de 6 en première ou en dernière position.");
        }
    }
}
