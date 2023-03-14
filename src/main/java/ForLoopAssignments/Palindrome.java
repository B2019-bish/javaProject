package ForLoopAssignments;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String input = scanner.nextLine();
        int letterMatch = 0;
        int j = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            if(input.toLowerCase().charAt(i) == input.toLowerCase().charAt(j)){
                letterMatch ++;
            }
            j--;
        }

        if(letterMatch == input.length()){
            System.out.println("It's a palindrome ");
        }
        else{
            System.out.println("It's not palindrome ");
        }
    }
}
