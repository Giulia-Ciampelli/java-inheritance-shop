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
    }
}
