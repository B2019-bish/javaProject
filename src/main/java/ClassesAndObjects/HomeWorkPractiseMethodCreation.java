package ClassesAndObjects;

public class HomeWorkPractiseMethodCreation {

    //Task1
    public static int twoIntegers(int a, int b){
        int total = a * b;
        return total;
    }

    //Task2
    public String lowerCaseString(String a){
        String word = a.toLowerCase();
        return word;
    }

    //Task3
    public double divide(int a, int b){
        double result = a / b;
        return result;
    }

    //Task 4
    public static boolean palindrome(String a){
        String word = "";
        boolean palindrome = false;
        for (int i = a.length() - 1; i >= 0; i--) {
            word += a.charAt(i);
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == word.charAt(i)) {
                palindrome = true;
            }
            else
                palindrome = false;
        }

        return palindrome;
    }

    //Task 5
    public double timesHundred(double a){
        a *= 100;
        return a;
    }

    //Task6
    public static boolean consonant(char a){
        String tempCharacter = "";
        tempCharacter += a;
        String vowels = "aeuioAEUIO";
        if(vowels.contains(tempCharacter)){
            return true;
        }
        else
            return false;
    }

    //Task7
    public boolean equalsFive(int a, int b){
        if(a - b == 5 || a - b == -5){
            return true;
        }
        else
            return false;
    }

    //Task 8
    public boolean validEmail(String a){
        if(a.contains("@") && a.contains(".")){
            return true;
        }
        else
            return false;
    }

    //Task 9
    public boolean primeNumber(int a){
        boolean prime = true;
        if(a <= 0){
            System.out.print("The number should be more than 0. ");
            prime = false;
        }

        else{
            for (int i = 2; i < a; i++) {
                if(a % i == 0){
                    return false;
                }
            }

        }

        return prime;
    }

    //Task 10

    public static boolean sameParity(int a, int b){
        if((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)){
            return true;
        }

        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Task 1 : " + twoIntegers(5, 8));
        HomeWorkPractiseMethodCreation object1 = new HomeWorkPractiseMethodCreation();
        System.out.println("Task 2 : " + object1.lowerCaseString("SOMETHING"));
        System.out.println("Task 3 : " + object1.divide(14, 5));
        System.out.println("Task 4 : " + palindrome("ama"));
        System.out.println("Task 5 : " + object1.timesHundred(23));
        System.out.println("Task 6 : " + consonant('U'));
        System.out.println("Task 7 : " + object1.equalsFive(10 ,5));
        System.out.println("Task 8 : " + object1.validEmail("bekzat@gmail.com"));
        System.out.println("Task 9 : " + object1.primeNumber(19));
        System.out.println("Task 10 : " + sameParity(3, 11));



    }

}