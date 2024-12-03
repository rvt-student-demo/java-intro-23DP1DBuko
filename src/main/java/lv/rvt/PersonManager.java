package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");
        
        ArrayList<Person> persons = new ArrayList<>();
        reader.readLine(); // izlaist virsrakstu
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            Person person = new Person(parts[0], parts[1], parts[2], parts[3]);
            persons.add(person);
        }
        return persons;
    }

   
}
