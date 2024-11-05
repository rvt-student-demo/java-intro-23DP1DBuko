package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.plaf.ScrollPaneUI;
import java.util.*;

public class App {

    public static void main(String[] args) {
        
        DecreasingCounter counter = new DecreasingCounter(2);
    
        counter.printValue();
    
        counter.decrement();
        counter.printValue();
    
        counter.decrement();
        counter.printValue(); 
    }
}