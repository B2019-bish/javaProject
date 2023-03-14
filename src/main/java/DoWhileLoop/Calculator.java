package DoWhileLoop;

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1;
        String operator;
        int number2;
        int output = 0;
        boolean tryAgain= false;
        String YesNo;

        do {
            System.out.println("Enter your first number : ");
            number1 = scanner.nextInt();
            System.out.println("Enter the operator : ");
            operator = scanner.next();
            System.out.println("Enter your second number : ");
            number2 = scanner.nextInt();

            if (operator.equals("+")){
                output = number1 + number2;
            }

            else if (operator.equals("-"))
                output = number1 - number2;

            else if (operator.equals("*"))
                output = number1 * number2;

            else if (operator.equals("/"))
                output = number1 / number2;

            else if (operator.equals("%"))
                output = number1 % number2;

            else
                System.out.println("Wrong operator enter");

            System.out.println("Output : " + output);

            System.out.print("Try again?(yes, no) : ");
            YesNo = scanner.next();

            if(YesNo.equals("yes"))
                tryAgain = true;

            else if(YesNo.equals("no"))
                tryAgain = false;

        }while(tryAgain != false);
    }
}
