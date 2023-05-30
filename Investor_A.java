package src;

public class Investor_A implements Investor {
    @Override
    public void update(Stock stock) {
        System.out.println("InvestorA: Price of " + stock.getName() + " has changed to " + stock.getPrice());
    }
}