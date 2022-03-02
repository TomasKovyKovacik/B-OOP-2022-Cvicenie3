package sk.stuba.fei.uim.oop.auto;

public class Vozidlo {
    protected String značka;
    protected int pocetKolies;

    public Vozidlo(String značka, int pocetKolies) {
        this.značka = značka;
    }

    public void trubit() {
        System.out.println("tututu");
    }
}
