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
        ArrayList<String> vardiArrayList = new ArrayList<>();
        
        while (true) {
            String vards = scanner.nextLine();
            vardiArrayList.add(vards);
            if (vards.equals("")) {
                break;
            }
        }
        System.out.println(vardiArrayList.get(2));
    }
}