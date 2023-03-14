package Day7;

public class StringManipulationHW2 {

    public static void main(String[] args) {

        //Task 1
        String word = "Hello, World!";
        System.out.println(word.substring(7, 13));


        //Task 2
        System.out.println(word.substring(7));


        //Task 3
        System.out.println(word.replaceAll("World", "Universe"));


        //Task 4
        System.out.println(word.substring(0, 5));


        //Task 5
        System.out.println(word.indexOf('!'));


        //Task 7
        System.out.println(word.replace('H', 'F'));


        //Task 8
        int count = 0;
        int index = 0;
        char searchedCharacter = 'l';
        while(count < 2){
            if(searchedCharacter == word.charAt(index))
                count++;
            index++;
        }
        System.out.println("The index of second occurrence of " + searchedCharacter + " is at : " + index);


        //Task 9
        String sentence = "     Hello , World!     ";
        System.out.println(sentence.trim());


        //Task10
        System.out.println(word.toUpperCase());


    }
}
