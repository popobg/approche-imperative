package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        float mean = (float) sum / array.length;
        System.out.printf("La moyenne des entiers du tableau est %s.", mean);
    }
}
