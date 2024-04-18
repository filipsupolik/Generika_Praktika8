public class Cukraren extends Predajna<Kolacik> {
    public Cukraren(String nazov) {
        super(nazov);
    }

    @Override
    public String otvaracieHodiny() {
        return "Otvaracie hodiny: \nPondelok - Piatok 10:00 - 15:00\nSobota 8:00 - 12:00\nNedela - zatvorene";
    }
}
