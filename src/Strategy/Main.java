package Strategy;

public class Main {
    public static void main(String[] args) {
        Character user = new Character();

        user.setAttackStrategy(new SwordStrategy());
        user.attack();

        user.setAttackStrategy(new BowStrategy());
        user.attack();
    }
}
