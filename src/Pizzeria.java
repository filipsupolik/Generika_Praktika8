public class Pizzeria extends Predajna<Pizza> {
    public Pizzeria(String nazov) {
        super(nazov);
    }

    @Override
    public String otvaracieHodiny() {
        return "Otvaracie hodiny: \nPondelok - Piatok 10:00 - 21:00\nSobota - Nedela 11:00 - 22:00\n";
    }
}
