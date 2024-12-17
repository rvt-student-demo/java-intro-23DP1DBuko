package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;

import javax.sound.midi.Soundbank; 
 
public class App { 
    public static void main(String[] args) {
        // objektu salidzinasana
        String a = "abc";
        String b = "abc";

        Student student1 = new Student("John");
        Student student2 = new Student("John");
        System.out.println(student1.equals(student2));

    }           
}