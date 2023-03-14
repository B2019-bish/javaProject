package ForLoopAssignments;

import java.util.Scanner;

public class practiceForLoops {

    public static void main(String[] args) {
        //Task 1
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        //Task 2
        String input = scanner.next();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            sum += Integer.parseInt("" + input.charAt(i));
        }
        System.out.println(sum);


        //Task3

        for (int i = 100; i >= 0; i--) {
            if(i % 2 != 0)
                System.out.println(i + " - odd");
        }


        //Task4
        for (int i = 1; i <= 31; i++) {
            System.out.println(i + " March 2023");
        }


        //Task5
        for (int i = 50; i >=1 ; i--) {
            if(i % 8 == 0)
                System.out.println(i);
        }

    }
}
