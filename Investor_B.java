package src;

public class Investor_B implements Investor {
    @Override
    public void update(Stock stock) {
        System.out.println("InvestorB: Price of " + stock.getName() + " has changed to " + stock.getPrice());
    }
}