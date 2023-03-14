package Batch2Assignments;

import java.util.Scanner;

public class GetAreaPerimeterSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a width of a square : ");
        int width = scanner.nextInt();
        System.out.println("a) area b) perimeter c) both ");
        System.out.print("Enter your input (a, b or c) : ");
        String areaOrPerimeter = scanner.next();


        switch(areaOrPerimeter){
            case "a" :
                System.out.println("The area of the square is : " + width * width);
                break;

            case "b" :
                System.out.println("The perimeter of the square is : " + width * 4);
                break;

            case "c" :
                System.out.print("The perimeter of the square is : " + width * 4);
                System.out.println(" and the area of the square is : " + width * width);
                break;
        }
    }

}
