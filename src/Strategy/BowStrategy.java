package Strategy;

public class BowStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("활 공격!!");
    }
}
