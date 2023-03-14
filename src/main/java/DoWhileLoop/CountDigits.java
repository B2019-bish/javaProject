package DoWhileLoop;

import java.util.Scanner;
public class CountDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        int NumberOfDigits;

        do{
            NumberOfDigits = 0;
            System.out.println("Enter a string : ");
            word = scanner.nextLine();

            for(int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                if("123456789".indexOf(letter) != -1){
                    NumberOfDigits++;
                }
            }


            System.out.println(NumberOfDigits + " digits");

        }while(NumberOfDigits != 3);

        System.out.println("You entered a word with 3 digits! ");


    }
}
