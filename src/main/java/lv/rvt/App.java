package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;

import javax.sound.midi.Soundbank; 
 
public class App { 
    public static void main(String[] args) {
        // primitivie datu tipa īpašības
        int x = 5;
        int y = x;
        modify(y);
        int c = x;
        x = 10;
        
        // System.out.println(c);
        
        // Reference datu tipu īpašības
        Person pers1 = new Person("John");
        Person pers2 = pers1;
        pers1.setName("bublik");
        modify(pers1);
        System.out.println(pers2.getName());
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    }

    public static void modify(int value){
        value += 5;
    }
}