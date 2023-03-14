package DoWhileLoop;
import java.util.Scanner;
public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        boolean quit = false;
        int enteredNumbers = 0;

        do{
            System.out.println("Enter a positive number (or negative to quit) : ");
            input = scanner.nextInt();
            if(input < 0){
                break;
            }
            else {
                sum += input;
                enteredNumbers++;
            }
        }while(quit = true);

        System.out.println("The average of all numbers : " + sum/enteredNumbers);


        /*

         */
    }

}
