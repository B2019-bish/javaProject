package ProblemSolving;

import java.util.Scanner;

public class ConcatenateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word : ");
        String word1 = scanner.next();
        System.out.print("Enter second word : ");
        String word2 = scanner.next();


        System.out.print(word1.toUpperCase().charAt(0) + word1.toLowerCase().substring(1, word1.length()));
        System.out.println(word2.toUpperCase().charAt(0) + word2.toLowerCase().substring(1, word2.length()));
    }

}
