package ForLoopAssignments;

import java.util.Scanner;

public class HomeWorkPractiseBreakAndContinue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int positiveInteger = scanner.nextInt();
        if(positiveInteger <= 0){
            while(positiveInteger <= 0){
                System.out.print("Input must be positive. Please try again : ");
                positiveInteger = scanner.nextInt();
            }
        }

        boolean found = false;
        for (int i = 1; i < positiveInteger; i++) {
            if(i % 3 == 0 && i % 5 != 0){
                found = true;
                System.out.println(i);
            }

        }

        if(found == false){
            System.out.println("There are no integers less than " + positiveInteger + " that are divisible by 3 but not by 5");
        }

    }

}
