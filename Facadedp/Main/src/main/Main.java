/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        // Drawing multiple shapes using the modified draw method
        facade.draw("circle", "square", "triangle");
        facade.draw("circle", "square", "triangle", "pentagon"); // Adding an unknown shape
    }
}
