package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.plaf.ScrollPaneUI;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }

}