
package demo;


// Demo class to demonstrate Decorator pattern
public class Demo {
    public static void main(String[] args) {
        // Creating a basic circle shape
        Shape circle = new Circle();

        // Printing shapes without decoration
        System.out.print("Shape without decoration: ");
        circle.draw();
        System.out.println();

        // Decorating with Red color
        Shape redCircle = new RedColorDecorator(circle);
        System.out.print("Shape with Red color: ");
        redCircle.draw();
        System.out.println();

        // Decorating with Thick border
        Shape thickBorderCircle = new ThickBorderDecorator(circle);
        System.out.print("Shape with Thick border: ");
        thickBorderCircle.draw();
        System.out.println();

        // Decorating with both Red color and Thick border
        Shape redAndThickBorderCircle = new RedColorDecorator(new ThickBorderDecorator(circle));
        System.out.print("Shape with Red color and Thick border: ");
        redAndThickBorderCircle.draw();
        System.out.println();
    }
}

