package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.plaf.ScrollPaneUI;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");

        Statistics statistics = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evenSum.sum());
                System.out.println("Sum of odd numbers: " + oddSum.sum());
                break;
            }
            statistics.addNumber(number);
            if (number % 2 == 0) {
                evenSum.addNumber(number);
            } else {
                oddSum.addNumber(number);
            }
        }        
    }
}