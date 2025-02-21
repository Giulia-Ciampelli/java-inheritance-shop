package org.lessons.java.inheritanceshop;

public class Main {
    public static void main(String[] args) {
        Smartphone fairphone = new Smartphone("Telefono Fairphone", "Fairphone", 128, 100);

        System.out.println(fairphone.getNomeEsteso());
        System.out.println(fairphone.getPrezzo());
        System.out.println(fairphone.getIMEI());
    }
}
