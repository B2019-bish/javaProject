package Day6;

public class StringManipulation {

    public static void main(String[] args) {

        //Task 1
        String message = "Hello everyone, let's do Java string exercises.";
        System.out.println("The character at position 10 is " + message.charAt(10));


        //Task 2
        System.out.println("The length of a String message : " + message.length());


        //Task 3
        System.out.println(message.toUpperCase());


        //Task 4
        System.out.println(message.toLowerCase());


        //Task 5
        System.out.println(message.charAt(4));


        //Task 6
        System.out.println(message.charAt(message.length() - 2));


        //Task 7
        System.out.println(message.toLowerCase().charAt(0));


        //Task 8
        System.out.println(message.toUpperCase().charAt(message.length()-2));


    }


}
