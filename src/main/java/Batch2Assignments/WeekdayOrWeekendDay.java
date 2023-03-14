package Batch2Assignments;

import java.util.Scanner;

public class WeekdayOrWeekendDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week : ");
        String day = scanner.next();

        switch(day){

            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday" :
                System.out.println("Weekday");
                break;
            case "Wednesday" :
                System.out.println("Weekday");
                break;
            case "Thursday" :
                System.out.println("Weekday");
                break;
            case "Friday" :
                System.out.println("Weekday");
                break;
            case "Saturday" :
                System.out.println("Weekend day");
                break;
            case "Sunday" :
                System.out.println("Weekend day");
                break;

        }


    }
}
