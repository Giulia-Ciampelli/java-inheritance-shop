package org.lessons.java.inheritanceshop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Stai cercando cuffie, smartphone o televisori? ");
        String search = input.nextLine();
        System.out.printf("Hai scritto: " + search);

        // come posso accedere agli oggetti nel main, che voglio tenere separati?
    }
}
