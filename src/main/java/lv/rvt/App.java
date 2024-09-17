package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        int second = Integer.valueOf(scanner.nextLine());

        if (first > second) {
            System.out.println("Greatest number is: " + first);
        } else if (first < second) {
            System.out.println("Greatest number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }   
}
