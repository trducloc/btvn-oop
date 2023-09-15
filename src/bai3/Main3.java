package bai3;

public class Main3 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.inputRectangleInfo();

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.findArea());
        System.out.println("Perimeter: " + rectangle.findPerimeter());
    }
}