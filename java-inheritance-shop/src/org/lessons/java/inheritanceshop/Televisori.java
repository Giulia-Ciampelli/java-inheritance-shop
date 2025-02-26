package org.lessons.java.inheritanceshop;

public class Televisori extends Prodotto {
    protected float dimensioni;
    protected boolean smart;

    public Televisori(String nome, String marca, float dimensioni, boolean smart, float prezzo) {
        super(nome, marca, prezzo);

        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public String getDimensioni() {
        String dimensioni = "Schermo: " + this.dimensioni + " pollici";
        return dimensioni;
    }
    
    public void setDimensioni(float dimensioni) {
        this.dimensioni = dimensioni;
    }

    public String getSmart() {
        String smart = "Smart: " + this.smart;
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
   
    @Override
    public String toString() {
        String result = String.format("%s\n %s\n %s\n %s\n %s\n", getNomeEsteso(), getMarca(), getDimensioni(), getSmart(), getPrezzo());
        return result;
    }
}
