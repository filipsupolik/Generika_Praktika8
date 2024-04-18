import java.util.ArrayList;

public abstract class Predajna<E> {
    private String nazov;
    private ArrayList<E> ponuka;

    public Predajna(String nazov) {
        this.nazov = nazov;
        this.ponuka = new ArrayList<E>();
    }

    public void pridajDoPonuky(E jedlo) {
        this.ponuka.add(jedlo);
    }

    public abstract String otvaracieHodiny();

    public String menu() {
        String vypis = " ";
        if (this.ponuka.isEmpty()) {
            vypis = "Ospravedlnujeme sa, nemame pre Vas ziadnu ponuku.";
        } else {
            System.out.println("Vita vas " + this.nazov);
            for (var prvok: this.ponuka) {
                vypis = prvok.toString();
            }
        }
        return vypis;
    }
}
