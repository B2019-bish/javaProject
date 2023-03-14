package ForLoopAssignments;

import java.util.Scanner;

public class HomeWorkReverseString {

    public static void main(String[] args) {

        System.out.println("Enter any word : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for(int i = (word.length() - 1); i >= 0; i--){
            System.out.print(word.charAt(i));
        }

    }
}
