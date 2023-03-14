package WhileLoop;

import java.util.Scanner;
public class HomeWorkSumOfOddIntergers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int positiveInteger = scanner.nextInt();

        if(positiveInteger <= 0){
            while(positiveInteger <= 0){
                System.out.print("Input must be positive. Please try again. ");
                positiveInteger = scanner.nextInt();
            }

        }

        int fromBeginingToEnd = 1;
        int sum = 0;
        while(fromBeginingToEnd <= positiveInteger){

            if(fromBeginingToEnd % 2 != 0){
                sum += fromBeginingToEnd;
            }
            fromBeginingToEnd++;
        }

        System.out.println("The sum of odd integers : " + sum);

    }




}
