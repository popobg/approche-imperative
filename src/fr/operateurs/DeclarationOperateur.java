package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args) {
        // AND-OR OPERATEURS LOGIQUES
        int a = 10;
        int b = 20;

        boolean testEt = a > 0 && b < 10;
        System.out.println("a > 0 ET b < 10: " + testEt);

        boolean testOu = a > 0 || b < 10;
        System.out.println("a > 0 OU b < 10: " + testOu);

        System.out.println();

        // OPERATEURS COMBINES
        a = a + 1;
        System.out.printf("Incrémenté avec +: %s%n", a);

        a++;
        System.out.printf("Incrémenté avec ++: %s%n", a);

        a += 1;
        System.out.printf("Incrémenté avec +=: %s%n", a);

        System.out.println();

        // OPERATEUR CONDITIONNEL TERNAIRE
        // Remplace une condition if/else
        String c = a > 0? "a est plus grand que 0": "a est inférieur à 0";
        System.out.println(c);
    }
}
