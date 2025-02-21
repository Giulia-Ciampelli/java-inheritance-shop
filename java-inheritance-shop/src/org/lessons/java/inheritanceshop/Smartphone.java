package org.lessons.java.inheritanceshop;

import java.util.Random;

public class Smartphone extends Prodotto {
    protected long IMEI; // 15 cifre
    protected int memoria;

    public Smartphone(String nome, String marca, int memoria, float prezzo) {
        super(nome, marca, prezzo);
        Random imeiRand = new Random();

        this.IMEI = imeiRand.nextLong(1000000000);
        this.memoria = memoria;
    }

    public long getIMEI() {
        return IMEI;
    }

    public String getMemoria() {
        String memoria = this.memoria + "GB";
        return memoria;
    }
}
