package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main(String[] args) {
        printTriangle(4);
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