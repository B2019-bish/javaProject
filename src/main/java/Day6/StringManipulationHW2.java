package Day6;

public class StringManipulationHW2 {

    public static void main(String[] args) {
        String word = "Hello world";

        //Task 1
        System.out.println(word.indexOf("world"));


        //Task2
        String hello = "Hello";
        System.out.println(hello.charAt(0));


        //Task3
        System.out.println("HELLO".toLowerCase());


        //Task4
        System.out.println("hello".toUpperCase());


        //Task5
        System.out.println("hello".equals("Hello"));


        //Task6
        word = "the quick brown fox";
        System.out.print(word.toUpperCase().charAt(0) + word.substring(1, 4));
        System.out.print(word.toUpperCase().charAt(4) + word.substring(5, 10));
        System.out.print(word.toUpperCase().charAt(10) + word.substring(11, 16));
        System.out.println(word.toUpperCase().charAt(16) + word.substring(17));


        //Task7
        hello = "Hello";
        System.out.print("" + hello.charAt(4) + hello.charAt(3) + hello.charAt(2) + hello.charAt(1) + hello.charAt(0));

        //Task8
        word = "Hello World";


    }


}

