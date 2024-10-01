package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main( String[] args ) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Give numbers: ");

        int sum = 0;
        int validNumbers = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;
        

        while (true) {
            int input = Integer.valueOf(reader.nextLine());

            if (input == 0) {
                break;
            }

            if (input < 0) {
                break;
            }

            if (input % 2 == 1) {
                oddNumbers ++;
            }
            
            if (input % 2 == 0) {
                evenNumbers ++;
            }
            sum += input;
            validNumbers++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + validNumbers);
        System.out.println("Average: " + (sum * 1.0 / validNumbers));
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }   
}