package Day12;

/*
Bekzat Abdykariev

Create SwitchHomework class and perform following tasks:
Write a program that takes symbol and prints corresponding meaning. Use switch statement.

 */

import java.util.Scanner;


public class SwitchStatements {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your symbol (!, ?, %, #, *, @, $) : ");
        char input = scanner.next().charAt(0);


        switch(input){

            case '!' :
                System.out.println("This is an exclamation mark. ");
                break;
            case '?' :
                System.out.println("This is a question mark. ");
                break;
            case '%' :
                System.out.println("This is a modulus. ");
                break;
            case '#' :
                System.out.println("This is a hash. ");
                break;
            case '*' :
                System.out.println("This is a star. ");
                break;
            case '@' :
                System.out.println("This is an at mark. ");
                break;
            case '$' :
                System.out.println("This is a dollar sign. ");
                break;

            default:
                System.out.println("Invalid input. ");
        }




    }


}
