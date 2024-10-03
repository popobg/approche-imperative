package fr.algorithmie;

public class InteractifFibonacci {
    public static void main(String[] args) {
        /*
        Suite de Fibonacci = suite arithmétique débutant par 0 et 1
        dans laquelle un nombre entier positif de rang N = somme des entiers positifs de rangs N-1 et N-2.
         */
        System.out.println();
        System.out.println("Vous allez devoir choisir un nombre entier positif qui représentera un certain rang N dans la suite de Fibonacci.\nA partir de ce rang, l'ordinateur calculera le nombre de Fibonacci qui lui est associé.");
        System.out.println();

        // Seul un nombre positif ou nul est accepté.
        // Un type "int" ne pourra pas stocker le résultat au-delà de 46
        // (> 2^32).
        int userNumber = Tools.getIntInput(0, 46);

        System.out.printf("Pour un rang %s, le nombre de Fibonacci associé est %s.", userNumber, testFibonacci(userNumber));
    }

    /*
     Possibilité également d'utiliser une fonction récursive,
     mais consommation de mémoire importante (O(2^n).
     L'algorithme linéaire via l'itération a une complexité spatiale de O(n).
     */
    public static int testFibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        // nombre de rang N-2
        int r2 = 0;
        // contiendra le nombre de fibonacci de rang N
        int r1 = 1;
        // nombre de rang N-1
        int inter;

        for (int i = 2; i < number + 1; i++) {
            inter = r1;
            r1 += r2;
            r2 = inter;
        }

        return r1;
    }
}
