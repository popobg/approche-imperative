package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
    // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
        verifier(1, 1, 0, false);
        verifier(0, 0, 7, false);
    }

    private static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        // check et résoud les cas faciles immédiatement
        if ((nbBig == 0 && nbSmall == 0)
                || longueur == 0
                || (nbSmall + (nbBig * 5) < longueur)) return false;
        else if (nbBig * 5 + nbSmall == longueur) return true;

        int constructionHeight = 0;

        while (constructionHeight < longueur && nbBig > 0) {
            constructionHeight += 5;
            nbBig -= 1;
        }

        if (constructionHeight == longueur) return true;
        else if (constructionHeight > longueur) {
            constructionHeight -= 5;
            nbBig += 1;
        }

        while (constructionHeight < longueur && nbSmall > 0) {
            constructionHeight += 1;
            nbSmall -= 1;
        }

        if (constructionHeight == longueur) return true;
        return false;
    }

    // Un autre algorithme qui fonctionne aussi, en utilisant la division entière
    private static boolean fabriquerMurAlternative(int nbSmall, int nbBig, int longueur) {
        if ((nbBig == 0 && nbSmall == 0)
                || longueur == 0
                || (nbSmall + (nbBig * 5) < longueur)) return false;
        else if (nbBig * 5 + nbSmall == longueur) return true;

        int nbBigUsed = 0;
        // On détermine le nombre de grosses briques nécessaires
        int nbBigNeeded = longueur / 5;
        if (nbBigNeeded == nbBig) {
            return true;
        }
        else if (nbBigNeeded < nbBig) {
            nbBigUsed = nbBigNeeded * 5;
        }
        else {
            nbBigUsed = nbBig;
        }

        // Puis on détermine le nombre de petites briques qu'il faudrait
        // pour compléter
        int nbSmallNeeded = longueur - nbBigUsed;
        if (nbSmallNeeded <= nbSmall) return true;
        return false;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
    {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
        else {
            System.out.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") OK.");
        }
    }
}
