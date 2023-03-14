package DoWhileLoop;

import java.util.*;

public class TenVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        boolean found = false;

        do {
            System.out.println("Enter your string : ");
            input = scanner.next();
            int countOfVowels = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'e' || input.charAt(i) == 'o' ||
                        input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'I' || input.charAt(i) == 'E' || input.charAt(i) == 'O' ||
                        input.charAt(i) == 'U') {
                    countOfVowels++;
                }
            }

            System.out.println("String has " + countOfVowels + " vowels. ");

            if(countOfVowels == 10)
                found = true;

        }while(found != true);
    }

}
