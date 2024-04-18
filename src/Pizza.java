import java.util.ArrayList;

public class Pizza {
    private boolean veganska;
    private ArrayList<Surovina> suroviny;
    private String nazov;

    public Pizza(String nazov) {
        this.suroviny = new ArrayList<>();
        this.nazov = nazov;
    }

    public void pridajSurovinu(Surovina surovina) {
        this.suroviny.add(surovina);
    }

    public boolean jeVeganska() {
        int pocetNevegSurovin = 0;
        for (Surovina surovina : this.suroviny) {
            if (surovina.isVeganska()) {
                pocetNevegSurovin++;
            }
        }
        if (pocetNevegSurovin > 0) {
            this.veganska = false;
        } else {
            this.veganska = true;
        }
        System.out.println("Pizza nie je veganska.");
        return this.veganska;
    }

    public void zveganciPizzu() {
        if (!this.jeVeganska()) {
            for (Surovina surovina: this.suroviny) {
                if (!surovina.isVeganska()) {
                    this.suroviny.remove(surovina);
                }
            }
        }
        System.out.println("Pizzu si zvegancil");
    }

    public double dajHmotnost() {
        double hmotnost = 0;
        for (Surovina surovina: this.suroviny) {
            hmotnost += surovina.getHmotnost();
        }
        return hmotnost;
    }

    public double dajCenu() {
        double cena = 0;
        for (Surovina surovina: this.suroviny) {
            cena += surovina.getCena();
        }
        return cena;
    }

    @Override
    public String toString() {
        String zlozenie = "Zlozenie: ";
        for (Surovina surovina : this.suroviny) {
            zlozenie += String.format("%s, ", surovina);
        }
        zlozenie = zlozenie.substring(0, zlozenie.length() - 2);
        String alergeny = "Alergeny: ";
        for (Surovina surovina : this.suroviny) {
            alergeny += String.format("%s, ", surovina.vypisAlergeny());
        }
        alergeny = alergeny.substring(0, alergeny.length() - 2);
        return String.format("%s -> Hmotnost:%.2fg Cena:%.2f€ %n%24s %n%30s", this.nazov, this.dajHmotnost(), this.dajCenu(), zlozenie, alergeny);
    }
}
