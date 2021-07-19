package TemplateMethod;

public class TemplateMethodExample {
    public static void main(String[] args) {
        new NaverMapView().initMap();
        new KakaoMapView().initMap();
    }
}
