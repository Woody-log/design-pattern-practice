package Adapter;

public interface FindAlgorithm {
    public void find(boolean global);
}

class FindVideoAlgorithm implements FindAlgorithm {
    @Override
    public void find(boolean global) {
        System.out.println("find video" + (global ? " globally" : ""));
    }
    // 동영상검색하는 코드
    // ...
    // ...
}
