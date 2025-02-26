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
        String colore = "Colore: " + this.colore;
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getWireless() {
        String wireless = "Wireless: " + this.wireless;
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n %s\n %s\n %s\n %s\n", getNomeEsteso(), getMarca(), getColore(), getWireless(), getPrezzo());
        return result;
    }
}
