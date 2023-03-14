package WhileLoop;

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        int i = 2;
        boolean NotPrimeNumber = false;

        while(i < number){
            if(number % i == 0){
                NotPrimeNumber = true;
                break;
            }
            i++;

        }

        if(NotPrimeNumber == true)
            System.out.println("Your number is not prime");

        else
            System.out.println("Your number is prime");

    }





}
