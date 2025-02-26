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

    public String getIMEI() {
        String IMEI = "Codice IMEI: " + this.IMEI;
        return IMEI;
    }

    // ha senso mettere un setter anche per l'imei? Nel caso si può mettere e settare su privato
    private void setIMEI(long IMEI) {
        this.IMEI = IMEI;
    }

    public String getMemoria() {
        String memoria = "Memoria: " + this.memoria + " GB";
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public String toString() {
        String result = String.format("%s\n %s\n %s\n %s\n", getNomeEsteso(), getMarca(), getMemoria(), getPrezzo());
        return result;
    }
}
