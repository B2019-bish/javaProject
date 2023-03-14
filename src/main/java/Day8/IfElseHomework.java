package Day8;

public class IfElseHomework {

    public static void main(String[] args) {

        //Task 1
        int number = 40;

        if(number > 0)
            System.out.println("The number is positive");
        else if(number < 0)
            System.out.println("The number is negative");
        else
            System.out.println("The number is zero");


        //Task 2
        int year = 2000;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("It is a leap year");
        }
        else
            System.out.println("It is not leap year");



        //Task 3
        int num1 = 3;
        int num2 = 123;

        if(num1 > num2)
            System.out.println("The num1 is larger than num2");
        else if(num1 == num2)
            System.out.println("They are equal");
        else
            System.out.println("The num2 is larger than num1");


        //Task 4
        double tempInFahrenheit = 77.3;

        if(tempInFahrenheit <= 32)
            System.out.println("The temperature is below freezing. ");
        else if(tempInFahrenheit >= 212)
            System.out.println("The temperature is above boiling. ");
        else
            System.out.println("The temperature is in between. ");


        //Task5
        byte month = 6;

        if(month == 12 || month == 1 || month == 2)
            System.out.println("Winter season");
        else if(month == 3 || month == 4 || month == 5)
            System.out.println("Spring season");
        else if(month == 6 || month == 7 || month == 8)
            System.out.println("Summer season");
        else if(month == 9 || month == 10 || month == 11)
            System.out.println("Fall season");

    }
}
