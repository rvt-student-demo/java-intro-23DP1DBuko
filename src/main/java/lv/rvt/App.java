package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;
import java.util.*;

public class App 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            intList.add(input);
            if (input == 0) {
                break;
            }
        }
        System.out.println(intList.get(1) + intList.get(2));
    }
}