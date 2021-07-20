package Decorator;

public class LaserDecorator extends FighterDecorator{
    public LaserDecorator(Fighter _decoratorFighter) {
        super(_decoratorFighter);
    }
    @Override
    public void attack() {
        super.attack();
        System.out.println("레이져 발사");
    }
}
