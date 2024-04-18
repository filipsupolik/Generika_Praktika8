public class Main {
    public static void main(String[] args) {
        Cukraren cukraren = new Cukraren("Cierna macka biely kocur");
        Kolacik punc = new Kolacik("Puncove rezy", 1.5, 40);
        punc.pridajAlergeny(Alergen.OBILNINY);
        punc.pridajAlergeny(Alergen.VAJCIA);
        punc.pridajAlergeny(Alergen.MLIEKO);
        cukraren.pridajDoPonuky(punc);
        Pizzeria pizzeria = new Pizzeria("Lazzi Pazzi");
        Pizza margerita = new Pizza("Margerita");
        margerita.pridajSurovinu(new Cesto(200, "Cesto", false, 2));
        margerita.pridajSurovinu(new Syr(30, "Syr", false, 1));
        pizzeria.pridajDoPonuky(margerita);
        System.out.println(cukraren.menu());
        System.out.println(cukraren.otvaracieHodiny());
        System.out.print("*****************************");
        System.out.println(pizzeria.menu());
        System.out.println(pizzeria.otvaracieHodiny());
    }
}