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
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Sum: " + statistics.sum());
                break;
            }
            statistics.addNumber(number);
        }        
    }
}