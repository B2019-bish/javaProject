package ForLoopAssignments;

import java.util.Scanner;
public class PractiseForLoopTask7 {

    public static void main(String[] args) {

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

    }


}
