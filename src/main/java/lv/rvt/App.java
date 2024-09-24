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
        int amount = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                System.out.println("Number of numbers: " + amount);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                amount += 1;
                sum += number;
            }
        }
    }   
}
