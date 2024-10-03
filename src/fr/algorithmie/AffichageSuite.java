package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        // BOUCLES FOR
        System.out.println("Avec les boucles for :");
        System.out.print("Voici les nombres entiers de 1 à 10 : ");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Voici les nombres entiers pairs de 0 à 10 : ");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Voici les nombres entiers impairs de 0 à 9 : ");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // BOUCLES WHILE
        System.out.println("Avec les boucles while :");
        int i = 1;
        System.out.print("Voici les nombres entiers de 1 à 10 : ");
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i = 0;
        System.out.print("Voici les nombres entiers pairs de 0 à 10 : ");
        while (true) {
            // condition d'arrêt : permet de sortir de la boucle infinie while(true)
            if (i > 10) break;
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        i = 1;
        System.out.print("Voici les nombres entiers impairs de 0 à 9 : ");
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
