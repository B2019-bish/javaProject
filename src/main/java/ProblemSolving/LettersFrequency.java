package ProblemSolving;

import java.util.Scanner;

public class LettersFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word : ");
        String input = scanner.nextLine();
        boolean found = false;


        for (int i = 0; i < input.length(); i++) {
            int counter = 0;

            for (int j = 0; j < input.length(); j++) {

                if (input.charAt(i) == input.charAt(j)) {
                    counter++;
                }

                if (counter > 1) {
                    found = true;
                }
            }
            System.out.println(input.charAt(i) + ": " + counter);

        }
    }

}

