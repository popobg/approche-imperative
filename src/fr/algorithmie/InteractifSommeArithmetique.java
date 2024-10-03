package fr.algorithmie;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        int userNumber = Tools.getIntInput(0, 2_000_000_000);

        int sum = 0;

        for (int i = 1; i <= userNumber; i++) {
            sum += i;
        }

        System.out.printf("La somme de tous les entiers de 1 à %s est %s.", userNumber, sum);
    }
}
