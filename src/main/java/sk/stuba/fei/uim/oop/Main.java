package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;
import sk.stuba.fei.uim.oop.auto.Vozidlo;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vozidlo bycikel = new Vozidlo("SOBI 20", 2);
        Auto volvo = new Auto("Volvo", "XC90", 4);

        bycikel.trubit();
        volvo.trubit();
    }
}
