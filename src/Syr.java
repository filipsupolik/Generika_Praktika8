public class Syr extends Surovina {
    public Syr(double hmotnost, String nazov, boolean veganska, double cena) {
        super(hmotnost, nazov, veganska, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return Alergen.MLIEKO;
    }
}
