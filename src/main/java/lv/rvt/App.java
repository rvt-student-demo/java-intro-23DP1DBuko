package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.plaf.ScrollPaneUI;
import java.util.*;

public class App {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card); 
    }
}