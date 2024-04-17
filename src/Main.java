public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margerita");
        pizza.pridajSurovinu(new Cesto(200, "Cesto", true, 2));
        pizza.pridajSurovinu(new Syr(30, "Syr", false, 1));
        System.out.println(pizza);
    }
}