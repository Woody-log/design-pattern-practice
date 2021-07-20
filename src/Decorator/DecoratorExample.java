package Decorator;

public class DecoratorExample {
    public static void main(String[] args) {


        new XWingFight().attack();
        // 탄환발사


        new LaserDecorator(new XWingFight()).attack();
        // 탄환발사
        // 레이저발사

        new PlasmaDecorator(
                new MissilDecorator(
                        new LaserDecorator(
                                new XWingFight()
                        ))).attack();
        // 탄환 발사
        // 레이저 발사
        // 미사일 발사
        // 플라즈마 발사
    }
}
