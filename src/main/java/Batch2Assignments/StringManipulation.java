package Batch2Assignments;

public class StringManipulation {

    public static void main(String[] args) {

        String str = "This is a random string for testing purposes";

        //Task1
        System.out.println(str.length());


        //Task 2
        System.out.println(str.charAt(1));


        //Task 3
        System.out.println(str.charAt(str.length()-1));


        //Task4
        System.out.println(str.replaceAll("o","i"));


        //Task5
        System.out.println(str.trim());


        //Task6
        String word = str.substring(10, 16);
        System.out.println(word);


        //Task7
        for (int i = word.length() - 1; i >= 0 ; i--) {
            System.out.print(word.toUpperCase().charAt(i));
        }

    }
}
