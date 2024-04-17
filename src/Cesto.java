public class Cesto extends Surovina {
    public Cesto(double hmotnost, String nazov, boolean veganska, double cena) {
        super(hmotnost, nazov, veganska, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return Alergen.OBILNINY;
    }
}
