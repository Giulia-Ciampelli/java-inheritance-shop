// Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
// Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
// Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
// Bonus:
// Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.
// Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%.
// Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
// Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
// Nella classe carrello chiedere all’utente se possiede una carta fedeltà
// In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.

// la classe Prodotto può essere considerata astratta? Perchè?

package org.lessons.java.inheritanceshop;

import java.util.Random;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected float prezzo;
    protected float iva = 0.22f; // essendo solo prodotti di elettronica, sono tutti tassati allo stesso modo;
                                 // questa ha senso metterla static
    protected float sconto;

    // switch case per sconti
    // caso default per tessera fedeltà: 0.02
    // sconto su telefoni che hanno meno di 32 gb di memoria: 0.05
    // sconto su tv non smart: 0.10
    // sconto su cuffie cablate: 0.07

    Prodotto(String nome, String marca, float prezzo) {
        Random rand = new Random();

        this.codice = rand.nextInt(1000000);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public String getNomeEsteso() {
        String result = this.nome + "-" + this.codice;
        return result;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        String marca = "marca: " + this.marca;
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrezzo() {
        float prezzoIva = this.prezzo + (this.prezzo * iva);
        String prezzoFormat = String.format("%.2f", prezzoIva);
        return prezzoFormat + "$";
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
}
