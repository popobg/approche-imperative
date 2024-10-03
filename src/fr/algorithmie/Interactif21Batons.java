package fr.algorithmie;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Interactif21Batons {
    public static void main(String[] args) {
        /*
        Ce jeu est connu sous le nom du "jeu de Nim".
        En connaissant l'algorithme, c'est le premier joueur à jouer
        qui l'emportera à coup sûr.
        Les calculs deviennent vite compliqués pour un humain
        mais ils sont très simples pour un ordinateur.

        On peut pimenter le jeu en ajoutant des lignes de jeu
        ou en randomisant le nombre de bâtons en début de partie.
        On peut aussi imaginer une version 2 joueurs.
         */

        // nombre de bâtons sur le plateau de jeu
        int board = 21;
        int playerChoice;
        int computerChoice;
        String loser;
        displayRules();
        displayBoard(board);
        wait2Sec();

        while(true) {
            // tour du joueur
            System.out.println("C'est votre tour.");
            playerChoice = playerTurn(board);
            board -= playerChoice;
            displayBoard(board);

            if (board == 0) {
               loser = "player";
               break;
            }

            // tour de l'ordi
            /*
            L'ordinateur tirera ici un nombre pseudo-aléatoire de bâtons.
            Nous pourrions imaginer un algorithme de parité
            pour que l'ordinateur choisisse astucieusement ses bâtons.
             */
            System.out.println("C'est le tour de l'ordinateur.");
            wait2Sec();
            computerChoice = computerTurn(board);
            System.out.printf("L'ordinateur a retiré %s bâton(s).%n", computerChoice);
            board -= computerChoice;
            displayBoard(board);

            if (board == 0) {
                loser = "computer";
                break;
            }
        }

        if (loser.equals("computer")) {
            System.out.println("Félicitations, vous avez gagné face à l'ordinateur !");
        }
        else {
            System.out.println("Dommage, vous avez perdu face à l'ordinateur...");
        }
    }

    public static void displayRules() {
        System.out.println();
        System.out.printf("%30s------------------------------------------------------%n", "");
        System.out.printf("%50sJEU DE NIM :%n", "");
        System.out.printf("%30sVous avez devant vous 21 petits bâtons disposés en ligne.%n", "");
        System.out.printf("%30sVous pouvez en retirer entre 1 et 3 à votre tour.%n", "");
        System.out.printf("%30sVous jouerez contre l'ordinateur.%n", "");
        System.out.printf("%30sLe perdant est celui qui prend le dernier bâton.%n", "");
        System.out.printf("%30sQue le meilleur gagne !%n", "");
        System.out.printf("%30s------------------------------------------------------%n", " ");
        System.out.println();
    }

    public static void displayBoard(int board) {
        System.out.println("Voici le plateau de jeu : " + board + " bâton(s).");
        for (int i = 0; i < board; i++) {
            if (i == board - 1) {
                System.out.print("|");
                break;
            }
            System.out.print("| ");
        }
        System.out.println("\n");
//        wait2Sec();
    }

    public static int playerTurn(int board) {
        if (board >= 3) {
            return Tools.getIntInput(1, 3);
        }
        else if (board == 1) {
            System.out.println("Il ne vous reste qu'un bâton, vous devez le prendre.");
            return 1;
        }
        else {
            return Tools.getIntInput(1, 2);
        }
    }

    public static int computerTurn(int board) {
        if (board > 4) {
            return generateRandomNumber(3);
        }
        else if (board == 1) {
            System.out.println("Il ne lui reste qu'un bâton, il doit le prendre.");
            return 1;
        }
        else {
            return board - 1;
        }
    }

    /**
     * Fonction statique retournant un nombre entier aléatoire
     * entre 1 et 3.
     * @return le nombre entier généré aléatoirement.
     */
    public static int generateRandomNumber(int limit) {
        Random random = new Random();
        return random.nextInt(limit - 1) + 1;
    }

    public static void wait2Sec() {
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
