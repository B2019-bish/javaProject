package Batch2Assignments;

import java.util.Scanner;

public class IfElseLogicalOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Task 1
        String vowels = "aeiou";
        String input;
        System.out.print("Enter a character : ");
        input = scanner.next();

        if(vowels.indexOf(input) != -1)
            System.out.println("It is a vowel");
        else
            System.out.println("It is a consonant");


        //Task2
        System.out.println("Enter a grade : ");
        int grade = scanner.nextInt();

        if(grade >= 90 && grade <= 100){
            System.out.println("A");
        }
        else if(grade >=80)
                System.out.println("B");

        else if(grade >= 70)
                System.out.println("C");

        else if(grade >=60)
                    System.out.println("D");

        else if(grade >= 0 && grade < 60)
            System.out.println("F");

        else
            System.out.println("Invalid input");


        //Task3
        System.out.print("Enter your input : ");
        input = scanner.next();

        if(input.equals(input.toLowerCase()))
            System.out.println("Lower case");
        else
            System.out.println("Upper case");


        //Task4
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        while(age >= 18){
            System.out.println("You are allowed to vote.");
            break;
        }
        while(age < 18){
            System.out.println("You are not allowed to vote.");
            break;
        }


        //Task5
        System.out.print("Enter two strings : ");
        String input1 = scanner.next();
        String input2 = scanner.next();

        while(input1.equals(input2)){
            System.out.println("They are equal. ");
            break;
        }

        while(!input1.equals(input2)){
            System.out.println("They are not equal. ");
            break;
        }


    }
}
