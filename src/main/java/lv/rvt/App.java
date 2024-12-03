package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*; 
 
public class App { 
    public static void main(String[] args) throws Exception { 
        Person person = new Person("Vika", 17, 50, 176);    
    
        PersonManager.addPerson(person);
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    } 
}