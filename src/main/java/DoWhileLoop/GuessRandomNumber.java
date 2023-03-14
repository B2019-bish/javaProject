package DoWhileLoop;

import java.util.*;
public class GuessRandomNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(1, 100);
        System.out.println("The random number : " + randomNumber);
        int input;
        do{

            System.out.print("Enter your guess : ");
            input = scanner.nextInt();

            if(input == randomNumber){
                System.out.println("Correct");

            }
            else if(input < randomNumber)
                System.out.println("Higher");

            else
                System.out.println("Lower");

        }while(input != randomNumber);
    }

}
