package ForLoopAssignments;


import java.util.Scanner;
public class ForLoopTask1 {

    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int total = 1;

        for(int i = input; i > 0; i--){
            total *= i;
        }

        System.out.println(total);

    }

}
