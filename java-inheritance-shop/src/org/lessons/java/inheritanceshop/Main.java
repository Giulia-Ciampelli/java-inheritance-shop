package org.lessons.java.inheritanceshop;

public class Main {
    public static void main(String[] args) {
        Smartphone fairphone = new Smartphone("Telefono Fairphone", "Fairphone", 128, 100);

        System.out.println(fairphone.getNomeEsteso());
        System.out.println(fairphone.getMarca());
        System.out.println(fairphone.getPrezzo());
        System.out.println(fairphone.getIMEI());
        System.out.println(fairphone.getMemoria());

        Cuffie jbl = new Cuffie("Cuffie JBL Tune 520 BT", "JBL", "nero", false, 45.8f);

        System.out.println(jbl.getNomeEsteso());
        System.out.println(jbl.getMarca());
        System.out.println(jbl.getPrezzo());
        System.out.println(jbl.getColore());
        System.out.println(jbl.getWireless());

        Televisori lg = new Televisori("LG 32LQ63006LA", "LG", 32, true, 189.70f);
        
        System.out.println(lg.getNomeEsteso());
        System.out.println(lg.getMarca());
        System.out.println(lg.getPrezzo());
        System.out.println(lg.getDimensioni());
        System.out.println(lg.getSmart());
    }
}
