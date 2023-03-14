package WhileLoop;

import java.util.Scanner;
public class HomeWorkFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int positiveNumber = scanner.nextInt();

        if(positiveNumber < 0){
            while(positiveNumber < 0){
                System.out.println("Enter a positive number : ");
                positiveNumber = scanner.nextInt();
            }

        }

        int factorial = 1;
        int tempPositiveNumber = positiveNumber;

        while(tempPositiveNumber > 1){
            factorial *= tempPositiveNumber;
            tempPositiveNumber--;
        }

        System.out.println("The factorial of " + positiveNumber + " is equal to " + factorial);

    }


}
