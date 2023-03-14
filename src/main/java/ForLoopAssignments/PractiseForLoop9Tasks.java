package ForLoopAssignments;

import java.util.Scanner;

public class PractiseForLoop9Tasks {

    public static void main(String[] args) {

        System.out.println("Task 1 -------------------------------------------------");
        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0)
                System.out.println(i);
        }
        System.out.println("Task 1 -------------------------------------------------");

        System.out.println("Task 2 -------------------------------------------------");
        for (int i = 2; i <= 20; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }
        System.out.println("Task 2 -------------------------------------------------");

        System.out.println("Task 3 -------------------------------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Task 3 -------------------------------------------------");

        System.out.println("Task 4 -------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++){
                System.out.print(j * i);
                System.out.print("      ");
            }
            System.out.println();
        }
        System.out.println("Task 4 -------------------------------------------------");

        System.out.println("Task 5 -------------------------------------------------");
        int count = 40;
        for (int i = 0; i <= count; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("Task 5 -------------------------------------------------");

        System.out.println("Task 6 -------------------------------------------------");
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
        System.out.println("Task 6 -------------------------------------------------");

        System.out.println("Task 7 -------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);

        if(number <= 0){
            while(number <= 0){
                System.out.println("Enter a positive number : ");
                input = scanner.nextLine();
                number = Integer.parseInt(input);
            }
        }


        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int a = Integer.parseInt(String.valueOf(c));
            total += a;
        }

        System.out.println("The sum : " + total);
        System.out.println("Task 7 -------------------------------------------------");

        System.out.println("Task 8 -------------------------------------------------");
        for (int i = 6; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("Task 8 -------------------------------------------------");

        System.out.println("Task 9 -------------------------------------------------");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("Task 9 -------------------------------------------------");

    }


}
