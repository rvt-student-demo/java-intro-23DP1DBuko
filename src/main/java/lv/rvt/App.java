package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Izveidojam vienu reizi, un lietojam zemāk
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        
        int userInputAsInt = Integer.valueOf(userInput);

        System.out.println(userInputAsInt);

        int cipars1 = Integer.valueOf(scanner.nextLine());
        int cipars2 = Integer.valueOf(scanner.nextLine());
        int cipars3 = Integer.valueOf(scanner.nextLine());
        
        // izvadit to skaitļu summu
        int summa = cipars1 + cipars2 + cipars3;
        System.out.println("Summa: " + summa);

        // izvadit to skaitļu reizinājumu
        System.out.println("Reizinājums: " + cipars1 * cipars2 * cipars3 );

        // Skaitļu un vidējo skaitļu izvade
        int vid = summa / 3;
        System.out.println("Vidējais aritmetiskais: " + vid);
    }

    
}
