package Day9;

public class Task4 {

    public static void main(String[] args){

        int number = 35;

        if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0){
            System.out.println("Not prime.");
        }
        else{
            System.out.println("Prime.");
        }

    }
}
