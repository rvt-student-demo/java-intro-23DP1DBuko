package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main(String[] args) {
        System.out.println("Printing stars");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();

        System.out.println("Printing a square");
        printSquare(4);
        System.out.println();

        System.out.println("Printing a rectangle");
        printRectangle(17, 3);
        System.out.println();

        System.out.println("Printing a triangle");
        printTriangle(4);
    }
    
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");    
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int a = 0; a < size; a++) {
            for (int i = 0; i < size; i++) {
                System.out.print("*");    
            }
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        for (int a = 0; a < height; a++) {
            for (int i = 0; i < width; i++) {
                System.out.print("*");    
            }
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int a = 0; a < size; a++) {
            for (int i = 0; i < a+1; i++) {
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}