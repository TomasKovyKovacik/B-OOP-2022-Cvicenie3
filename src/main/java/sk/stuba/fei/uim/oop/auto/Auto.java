package sk.stuba.fei.uim.oop.auto;

public class Auto extends Vozidlo {
    private String modeloveMeno;
    public Auto(String značka, String modeloveMeno, int pocetKolies) {
        super(značka, pocetKolies);
    }

    @Override
    public void trubit() {
        System.out.println("tuuuuuuuuu");
    }
}
