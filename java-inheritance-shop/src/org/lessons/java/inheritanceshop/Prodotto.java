// TODO: Usa l'override per rendere i metodi più veloci da usare
// la classe Prodotto può essere considerata astratta? Perchè?

package org.lessons.java.inheritanceshop;

import java.util.Random;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected float prezzo;
    protected float iva = 0.22f; // essendo solo prodotti di elettronica, sono tutti tassati allo stesso modo; questa ha senso metterla static
    
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
