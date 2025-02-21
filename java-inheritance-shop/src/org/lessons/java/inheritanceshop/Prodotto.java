// Creare la classe Prodotto che gestisce i prodotti dello shop. 

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - marca
// - prezzo
// - iva

// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
// - il codice prodotto sia accessibile solo in lettura
// - gli altri attributi siano accessibili sia in lettura che in scrittura

// Lo shop gestisce diversi tipi di prodotto: 
// - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
// - Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
// - Cuffie, caratterizzate dal colore e se sono wireless o cablate

// Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

package org.lessons.java.inheritanceshop;

import java.util.Random;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected float prezzo;
    protected float iva = 0.22f; // essendo solo prodotti di elettronica, sono tutti tassati allo stesso modo
    
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

    public String getMarca() {
        return marca;
    }

    public String getPrezzo() {
        float prezzoIva = this.prezzo + (this.prezzo * iva);
        String prezzoFormat = prezzoIva + "$";
        return prezzoFormat;
    }
}
