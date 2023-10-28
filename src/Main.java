public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Unit unit1 = new Unit("Sasha");
        Unit unit2 = new Unit("Aleksey");

        Game game2 = new Game();
        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");

        Game.print();

    }
}
