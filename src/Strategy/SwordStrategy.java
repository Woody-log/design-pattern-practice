package Strategy;

public class SwordStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("검 공격!!");
    }
}
