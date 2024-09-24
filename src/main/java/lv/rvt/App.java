package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int start = Integer.valueOf(scanner.nextLine());
        int end = 100;
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
        
    }   
}
