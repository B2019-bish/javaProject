package ProblemSolving;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String word = scanner.nextLine();
        String tempWord = "";
        boolean palindrome = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            tempWord += word.charAt(i);
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == tempWord.charAt(i)) {
                palindrome = true;
            }
            else
                palindrome = false;
        }

        if(palindrome == true)
            System.out.println("It is palindrome.");
        else
            System.out.println("It is not palindrome.");
    }
}
