package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main(String[] args) {
        printRectangle(17, 3);
    }
    
    public static void printRectangle(int width, int height) {
        for (int a = 0; a < height; a++) {
            for (int i = 0; i < width; i++) {
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}