package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        // 1. DECLARATION DE VARIABLES
        // ENTIERS
        byte byteNumber = 127;
        short shortNumber = -32000;
        int intNumber = 125_000;
        // Sans L, conversion implicite vers un "int"
        long longNumber = -60_000_000L;

        // DECIMAUX
        float floatNumber = 1.289F;
        double doubleNumber = 94.6D;

        char dollarChar = '$';

        boolean myBool = true;

        // String != type primitif en Java
        String str = "This is a string.";

        // 2. AFFICHAGE DES VARIABLES
        System.out.println("Affichage des variables :");
        System.out.println("Un nombre décimal déclaré : " + floatNumber);
        System.out.println("Une chaîne de caractères non déclarée : " + "hello");

        System.out.println();

        // 3. AJOUT D'UN SAUT DE LIGNE DANS UNE CHAINE DE CARACTERES
        String randomString = "Voici le résultat d'un calcul : 1 + 5 = 6";
        System.out.println("Sans saut de ligne :\n" + randomString);

        System.out.println();

        // add a line break after the colon
        randomString = randomString.replace(": ", ":\n");
        System.out.println("Après saut de ligne :\n" + randomString);
    }
}
