package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        // 1. DECLARE VARIABLES
        // integer types
        byte byteNumber = 127;
        short shortNumber = -32000;
        int intNumber = 125_000;
        // without L, implicit conversion into an "int"
        long longNumber = -60_000_000L;

        // decimal types
        float floatNumber = 1.289F;
        double doubleNumber = 94.6D;

        char dollarChar = '$';

        boolean myBool = true;

        // not a primitive type in Java
        String str = "This is a string.";

        // 2. DISPLAY VARIABLES
        System.out.println("Displaying variables:");
        System.out.println("Here is my float number: " + floatNumber);
        System.out.println("Just a normal string: " + "hello");

        System.out.println();

        // 3. ADD A LINE BREAK INTO A STRING
        String randomString = "Voici le résultat d'un calcul : 1 + 5 = 6";
        System.out.println("Before line break:\n" + randomString);

        System.out.println();

        // add a line break after the colon
        randomString = randomString.replace(": ", ":\n");
        System.out.println("After line break:\n" + randomString);
    }
}
