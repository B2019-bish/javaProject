package Day6;

public class PractiseEqualsAndequals {

    public static void main(String[] args) {


        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");

        //Task 1
        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));

        //Task 2
        System.out.println(hello1 == hello3);

        //Task 3
        System.out.println(hello1 == hello3);


        //Task 4
        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));


        //Task 5
        System.out.println(hello1.toUpperCase().equals(hello3.toUpperCase()));


    }
}
