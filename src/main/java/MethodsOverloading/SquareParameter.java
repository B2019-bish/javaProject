package MethodsOverloading;

public class SquareParameter {

    public int getPerimeterOfSquare(int length, int width){
        return length * width;
    }

    public int getPerimeterOfSquare(double length, double width){
        return (int)(length * width);
    }

    public int getPerimeterOfSquare(long length, long width){
        return (int)(length * width);
    }

}
