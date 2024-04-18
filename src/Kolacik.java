import java.util.ArrayList;

public class Kolacik {
    private String nazov;
    private double cena;
    private int hmostnost;
    private ArrayList<Alergen> alergeny;

    public Kolacik(String nazov, double cena, int hmostnost) {
        this.nazov = nazov;
        this.cena = cena;
        this.hmostnost = hmostnost;
        this.alergeny = new ArrayList<>();
    }

    public void pridajAlergeny(Alergen alergen) {
        this.alergeny.add(alergen);
    }

    @Override
    public String toString() {
        String alergeny = "Alergeny: ";
        for (Alergen alergen : this.alergeny) {
            alergeny += String.format("%s, ", alergen);
        }
        alergeny = alergeny.substring(0, alergeny.length() - 2);
        return String.format("%s -> Hmotnost:%dg Cena:%.2f€ %n%24s", this.nazov, this.hmostnost, this.cena, alergeny);
    }
}
