package DoWhileLoop;

import java.util.Scanner;

public class EnterEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do{
            System.out.print("Enter an even number : ");
            input = scanner.nextInt();

        }while(input % 2 != 0);

    }
}
