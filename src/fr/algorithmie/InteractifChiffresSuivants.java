package fr.algorithmie;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        int userNumber = Tools.getIntInput(1, 10);

        System.out.println("Les 10 chiffres suivants " + userNumber + " sont :");
        for (int i = userNumber + 1; i <= userNumber + 10; i++) {
            if (i < userNumber + 10) {
                System.out.print(i + ", ");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
