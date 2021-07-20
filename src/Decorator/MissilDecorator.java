package Decorator;

public class MissilDecorator extends FighterDecorator{
    public MissilDecorator(Fighter _decoratorFighter) {
        super(_decoratorFighter);
    }
    @Override
    public void attack() {
        super.attack();
        System.out.println("미사일 발사");
    }
}
