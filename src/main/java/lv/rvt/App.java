package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;
import java.util.*;

public class App {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(scanner.nextLine()));

        while (numbers.get(numbers.size()-1) != -1) {
            numbers.add(Integer.valueOf(scanner.nextLine()));
        }
        
        System.out.print("From where?");
        Integer from = Integer.valueOf(scanner.nextLine());

        while (numbers.size()-1 < from || from < 0) {
            System.out.print("From where?");
            from = Integer.valueOf(scanner.nextLine());
        }

        System.out.print("To where?");
        Integer to = Integer.valueOf(scanner.nextLine());

        while (numbers.size()-1 < to || to < 0) {
            System.out.print("To where?");
            to = Integer.valueOf(scanner.nextLine());
        }

        while (from <= to) {
            System.out.println(numbers.get(from));
            from ++;
        }
    }

}