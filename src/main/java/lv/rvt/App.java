package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;

import javax.sound.midi.Soundbank; 
 
public class App { 
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        System.out.println("Welcome to person manager, type \"help\" to see available commands.");

        while (isProgramRunning) {
            String command = scanner.nextLine();

            if(command.equals("exit")) {
                isProgramRunning = false;
            } else if (command.equals("show")) {
                
                System.out.println("Show all persons");
                ArrayList<Person> allPersons = PersonManager.getPersonList();
                for (Person person1: allPersons) {
                    System.out.println(person1);
                }

            } else if (command.equals("add")) {
                
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter you weight: ");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter your height: ");
                int height = Integer.valueOf(scanner.nextLine());
    
                Person person = new Person(name, age, weight, height);
    
                PersonManager.addPerson(person);
                System.out.println("Person added");

            } else if (command.equals("help")) {
                
                System.out.println("Available commands:");
                System.out.println("- show: parāda visas personas no csv faila.");
                System.out.println("- add: pievieno personu csv failam.");
                System.out.println("- help: parāda iespējamas komandas.");
                System.out.println("- exit: aptur programmas darbību ar paziņojumu (Thanks, bye bye!)");
            
            }
            System.out.println("Your command was: " + command);
        }
        System.out.println("Thanks, bye bye!");
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    } 
}