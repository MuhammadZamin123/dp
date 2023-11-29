/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

class ShapeFacade {
    private Circle circle;
    private Square square;
    private Triangle triangle;

    public ShapeFacade() {
        this.circle = new Circle();
        this.square = new Square();
        this.triangle = new Triangle();
    }

    public void draw(String... shapes) {
        StringBuilder sb = new StringBuilder();
        for (String shape : shapes) {
            switch (shape.toLowerCase()) {
                case "circle":
                    circle.draw();
                    sb.append("Circle ");
                    break;
                case "square":
                    square.draw();
                    sb.append("Square ");
                    break;
                case "triangle":
                    triangle.draw();
                    sb.append("Triangle ");
                    break;
                default:
                    sb.append("Unknown shape: ").append(shape).append(" ");
                    break;
            }
        }
        System.out.println("Shapes drawn: " + sb.toString());
    }

    void draw(String circle, String square, String triangle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
