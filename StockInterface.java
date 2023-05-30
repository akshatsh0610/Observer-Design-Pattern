package src;

public interface StockInterface {
    public void register(Investor investor);
    public void unregister(Investor investor);
    public void notifyChange();
}
