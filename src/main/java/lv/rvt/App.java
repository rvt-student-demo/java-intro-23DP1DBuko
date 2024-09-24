package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scanner.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        }
        else if (5000 <= gift && gift < 25000) {
            double giftTax = (100 + (gift - 5000) * 0.08);
            System.out.println("Tax: " + giftTax);
        }
        else if (25000 <= gift && gift < 55000) {
            double giftTax = (1700 + (gift - 25000) * 0.1);
            System.out.println("Tax: " + giftTax);
        }
        else if (55000 <= gift && gift < 200000) {
            double giftTax = (4700 + (gift - 55000) * 0.12);
            System.out.println("Tax: " + giftTax);
        }
        else if (200000 <= gift && gift < 1000000) {
            double giftTax = (22100 + (gift - 200000) * 0.15);
            System.out.println("Tax: " + giftTax);
        }
        else if (1000000 <= gift) {
            double giftTax = (142100 + (gift - 1000000) * 0.17);
            System.out.println("Tax: " + giftTax);
        }
    }   
}
