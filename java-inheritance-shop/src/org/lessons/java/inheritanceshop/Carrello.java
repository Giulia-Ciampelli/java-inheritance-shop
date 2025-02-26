package org.lessons.java.inheritanceshop;

import java.util.Scanner;

public class Carrello {

    // come posso accedere agli oggetti nel main, che voglio tenere separati? Array
    static Prodotto[] prodotti = new Prodotto[0];

    public static void riempiCarrello(Prodotto prodotto) {
        Prodotto[] prodottiAggiornati = new Prodotto[prodotti.length + 1];

        for (int i = 0; i < prodotti.length; i++) {
            prodottiAggiornati[i] = prodotti[i];
        }
        prodottiAggiornati[prodotti.length] = prodotto;
        prodotti = prodottiAggiornati;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Stai cercando cuffie, smartphone o televisori? ");
        String search = input.nextLine();

        // per ora creo un nuovo prodotto
        Prodotto prodottoScelto = new Prodotto(null, null, 0);

        switch (search) {
            case "telefono":
            case "smartphone":
                System.out.println("Inserisci il nome: ");
                String nomeSmartphone = input.nextLine();

                System.out.println("Inserisci la marca: ");
                String marcaSmartphone = input.nextLine();

                System.out.println("Inserisci la memoria: ");
                int memoriaSmartphone = input.nextInt();

                System.out.println("Inserisci il prezzo: ");
                float prezzoSmartphone = input.nextFloat();

                prodottoScelto = new Smartphone(nomeSmartphone, marcaSmartphone, memoriaSmartphone, prezzoSmartphone);
                break;

            case "tv":
            case "televisore":
                System.out.println("Inserisci il nome: ");
                String nomeTV = input.nextLine();

                System.out.println("Inserisci la marca: ");
                String marcaTV = input.nextLine();

                System.out.println("Inserisci le dimensioni: ");
                float dimensioniTV = input.nextFloat();

                System.out.println("La TV è smart? (y/n)");
                String smartTV = input.next();
                boolean smartBooleanTV;

                if (smartTV.equals("y")) {
                    smartBooleanTV = true;
                } else if (smartTV.equals("n")) {
                    smartBooleanTV = false;
                } else {
                    System.out.println("errore, inserisci 'y' o 'n' per rispondere");
                    smartBooleanTV = false; // RICORDA: serve il booleano in tutti i casi, o non lo prende
                }

                System.out.println("Inserisci il prezzo: ");
                float prezzoTV = input.nextFloat();

                prodottoScelto = new Televisori(nomeTV, marcaTV, dimensioniTV, smartBooleanTV, prezzoTV);
                break;

            case "cuffie":
                System.out.println("Inserisci il nome: ");
                String nomeCuffie = input.nextLine();

                System.out.println("Inserisci la marca: ");
                String marcaCuffie = input.nextLine();

                System.out.println("Inserisci il colore: ");
                String coloreCuffie = input.nextLine();

                System.out.println("Le cuffie sono wireless? (y/n)");
                String wirelessCuffie = input.next();
                boolean wirelessBooleanCuffie;

                if (wirelessCuffie.equals("y")) {
                    wirelessBooleanCuffie = true;
                } else if (wirelessCuffie.equals("n")) {
                    wirelessBooleanCuffie = false;
                } else {
                    System.out.println("errore, inserisci 'y' o 'n' per rispondere");
                    wirelessBooleanCuffie = false;
                }

                System.out.println("Inserisci il prezzo: ");
                float prezzoCuffie = input.nextFloat();

                prodottoScelto = new Cuffie(nomeCuffie, marcaCuffie, coloreCuffie, wirelessBooleanCuffie, prezzoCuffie);
                break;

            default:
                System.out.println("Mi spiace, non abbiamo quel prodotto in stock.");
                break;
        }
        riempiCarrello(prodottoScelto);

        System.out.printf("Prodotto scelto: \n" + prodottoScelto);

        input.close();
    }
}
