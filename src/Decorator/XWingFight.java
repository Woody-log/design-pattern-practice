package Decorator;

public class XWingFight implements Fighter{
    @Override
    public void attack() {
        System.out.println("탄환 발사");
    }
}
