package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args) {
        // AND-OR LOGICAL OPERATORS
        int a = 10;
        int b = 20;

        boolean testEt = a > 0 && b < 10;
        System.out.println("a > 0 AND b < 10: " + testEt);

        boolean testOu = a > 0 || b < 10;
        System.out.println("a > 0 OR b < 10: " + testOu);

        System.out.println();

        // COMBINED OPERATORS
        a = a + 1;
        System.out.printf("Increment with +: %s%n", a);

        a++;
        System.out.printf("Increment with ++: %s%n", a);

        a += 1;
        System.out.printf("Increment with +=: %s%n", a);

        System.out.println();

        // TERNARY OPERATOR
        // same as an if/else condition
        String c = a > 0? "a est plus grand que 0": "a est inférieur à 0";
        System.out.println(c);
    }
}
