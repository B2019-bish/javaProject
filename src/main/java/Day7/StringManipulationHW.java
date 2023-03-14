package Day7;

public class StringManipulationHW {

    public static void main(String[] args) {
        //Task 1
        String str1 = "Hello, Universe!";
        char ch = 'o';
        System.out.println("str1 contains " + ch + " as " + str1.indexOf(ch) + "th character");


        //Task2
        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println(str2.substring(start, end));


        //Task3
        String str3 = "Good morning World";
        char letter = 'W';
        int index = str3.indexOf(letter);
        System.out.println(str3.charAt(index));


        //Task4
        String str4 = "         I love coding     ";
        System.out.println(str4.trim());


        //Task 5
        String str5 = " Learn as if you will live forever, live like you will die tomorrow.";
        System.out.println(str5.replace('o', ' '));
    }

}
