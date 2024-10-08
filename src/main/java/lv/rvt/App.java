package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
    
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");    
        }
        System.out.println();
    }
}