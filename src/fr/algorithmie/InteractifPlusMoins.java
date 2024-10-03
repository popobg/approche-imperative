package fr.algorithmie;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100);
        int userNumber = 101;
        int tryCount = 0;

        System.out.println();
        System.out.println("CONSIGNES :");
        System.out.println("Vous allez devoir deviner le nombre choisi par l'ordinateur.\nCe nombre est compris entre 0 et 100 (inclus).\nSi vous voulez quitter le jeu sans deviner, taper -1.");
        System.out.println();
        while (true) {
            userNumber = Tools.getIntInput(-1, 100);
            tryCount++;

            if (userNumber == -1) {
                System.out.println("Fermeture du jeu...");
                break;
            }
            else if (userNumber == randomNumber) {
                System.out.printf("C'est gagné ! Le nombre était bien %s.\nVous avez trouvé en %s tentatives, bravo.", randomNumber, tryCount);
                break;
            }
            else if (userNumber < randomNumber) {
                System.out.printf("Le nombre à trouver est plus grand que %s.%n%n", userNumber);
            }
            else {
                System.out.printf("Le nombre à trouver est plus petit que %s.%n%n", userNumber);
            }
        }
    }
}
