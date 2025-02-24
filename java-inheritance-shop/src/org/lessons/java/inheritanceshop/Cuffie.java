package org.lessons.java.inheritanceshop;

public class Cuffie extends Prodotto {
    protected String colore;
    protected boolean wireless;

    public Cuffie(String nome, String marca, String colore, boolean wireless, float prezzo) {
        super(nome, marca, prezzo);

        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        String colore = "colore: " + this.colore;
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    // trasforma in stringa per renderlo più leggibile
    public boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
