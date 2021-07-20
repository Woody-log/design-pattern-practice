package Decorator;

public abstract class FighterDecorator implements Fighter {
    private Fighter decoratordFighter;
    public FighterDecorator(Fighter _decoratorFighter) {
        decoratordFighter = _decoratorFighter;
    }
    @Override
    public void attack() {
        decoratordFighter.attack();
    }
}
