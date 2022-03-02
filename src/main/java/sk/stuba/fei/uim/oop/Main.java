package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        Auto vw = new Auto(50);

        System.out.println("skoda");
        System.out.println(skoda.stav());
        skoda.jazdi(100);
        System.out.println(skoda.stav());

        System.out.println("vw");
        System.out.println(vw.stav());
        vw.jazdi(100);
        System.out.println(vw.stav());

    }
}
