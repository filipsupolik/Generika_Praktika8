public abstract class Surovina {
    private double hmotnost;
    private String nazov;
    private boolean veganska;
    private double cena;

    public Surovina(double hmotnost, String nazov, boolean veganska, double cena) {
        this.hmotnost = hmotnost;
        this.nazov = nazov;
        this.veganska = veganska;
        this.cena = cena;
    }

    public boolean isVeganska() {
        return this.veganska;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public double getCena() {
        return cena;
    }

    public abstract Alergen vypisAlergeny();

    @Override
    public String toString() {
        return this.nazov;
    }
}
