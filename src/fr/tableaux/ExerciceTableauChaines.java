package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] cities = { "Kyoto", "Montevideo", "Sidney", "Strasbourg", "Bamako" };
        System.out.println("Villes : " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + ", " + cities[4]);
        // displayArray(cities);

        cities[3] = "Reims";
        System.out.println("Villes après modification du 4ème élément : " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + ", " + cities[4]);
        // displayArray(cities);
    }

    public static void displayArray(String[] array) {
        // itération sur un objet "collection"
        //  for (String element : array) {
        //  System.out.println("Ville : " + element);
        //  }

        // itération avec incrémentation d'un index i
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Ville n° %s : %s%n", i + 1, array[i]);
        }
        System.out.println();
    }
}
