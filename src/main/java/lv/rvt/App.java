package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main(String[] args) {
        printSquare(4);
    }
    
    public static void printSquare(int size) {
        for (int a = 0; a < size; a++) {
            for (int i = 0; i < size; i++) {
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}