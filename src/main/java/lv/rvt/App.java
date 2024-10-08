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
        System.out.println();
        printStars(3);
        System.out.println();
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
        System.out.println();

        System.out.println("Printing stars and spaces");
        printSpaces(5);
        System.out.println();
        printStars(3);
        System.out.println();

        System.out.println("Printing a right-leaning triangle");
        printTriangle2(4);

        System.out.println("Printing a Christmas tree");
        christmasTree(10);
        System.out.println();

    }
    
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");    
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
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

    public static void printTriangle2(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size-(i+1));
            printStars(i+1);
            System.out.println();
        }
        System.out.println();
    }

    public static void christmasTree(int height) {
        int a = 1;
        for (int i = 0; i < height; i++) {
            printSpaces(height-(i+1));
            printStars(a);
            a += 2;
            System.out.println();
            
        }
        printSpaces(height-2);
        printStars(3);
        System.out.println();
        printSpaces(height-2);
        printStars(3);
    }
}