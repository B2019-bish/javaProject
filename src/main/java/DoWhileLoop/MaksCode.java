package DoWhileLoop;
import java.util.*;

public class MaksCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int vowelAmount;

        do {
            System.out.println("Enter string");
            String str = sc.nextLine();
            vowelAmount = 0;
            for (int a = 0; a < str.length(); a++) {
                char c = str.charAt(a);
                if ("aeoiuAEOUI".indexOf(c) != -1) {
                    vowelAmount++;
                }
            }
            System.out.println("The number is of vowels is: " + vowelAmount);

        }while (vowelAmount < 10);
        System.out.println("Your string reached 10 vowels");
    }


}
