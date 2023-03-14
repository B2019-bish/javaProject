package MethodsOverloading;

public class PrimeNumber {

    public boolean primeNumber(int input){
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean primeNumber(short input){
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean primeNumber(long input){
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }



}
