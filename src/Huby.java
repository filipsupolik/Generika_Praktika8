public class Huby extends Surovina {
    public Huby(double hmotnost, String nazov, boolean veganska, double cena) {
        super(hmotnost, nazov, veganska, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return null;
    }
}
