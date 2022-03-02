package sk.stuba.fei.uim.oop.auto;

public class Auto {
    public static final double PALIVO_NA_KM = 0.2;
    public static final double KAPACITA_NADRZE = 100;
    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean ojazdene;

    public Auto() {
        this(KAPACITA_NADRZE);
    }

    public Auto(double kapacitaNadrze) {
        this.ojazdene = true;
        this.stavNadrze = 50;
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public void jazdi(double vzdialenost) {
        this.ojazdene = true;
        stavNadrze -= vzdialenost * PALIVO_NA_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public String stav() {
        String vysledok;
        if (this.ojazdene) {
            vysledok = "Auto je ojazdene";
        } else {
            vysledok = "Auto je neojazdene";
        }
        vysledok += " * stav nadrze: " + stavNadrze + "/" + kapacitaNadrze;
        return vysledok;
    }

    public double getKapacitaNadrze() {
        return kapacitaNadrze;
    }

    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public boolean isOjazdene() {
        return ojazdene;
    }

    public void setOjazdene(boolean ojazdene) {
        this.ojazdene = ojazdene;
    }
}
