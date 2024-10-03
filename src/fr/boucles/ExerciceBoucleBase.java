package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        System.out.print("Voici les nombres de 1 à 10 : ");
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                System.out.println(i);
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("Mon nom est :");
        for (int i = 1; i < 21; i++) {
            System.out.println(i + ". Pauline Bouyssou");
        }
        System.out.println();

        System.out.print("Nombres pairs de 2 à 100 : ");
        for (int i = 2; i <= 100; i += 2) {
            if (i == 100) {
                System.out.println(i);
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.print("Elément impairs de 1 à 99 : ");
        for (int i = 1; i < 100; i += 2) {
            if (i == 99) {
                System.out.println(i);
                continue;
            }
            System.out.print(i + ", ");
        }
    }
}
