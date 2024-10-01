package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main(String[] args) {
        printUntilNumber(2);
    }
    public static void printUntilNumber(int i) {
        int num = 1;
        while (num <= i) {
            System.out.println(num);
            num ++;
        }
    }

}