package Adapter;

public class SearchFindAdapter implements SearchStrategy {
    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter (FindAlgorithm _findAlgorithm) {
        findAlgorithm = _findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}
