package src;

public class StockMarket {
    public static void main(String []args)
    {
        Stock stock = new Stock("XYZ", 100.0);

        Investor_A investorA = new Investor_A();
        Investor_B investorB = new Investor_B();

        stock.register(investorA);
        stock.register(investorB);

        stock.setPrice(110.0);
        investorA.update(stock);
        stock.setPrice(95.0);
        investorA.update(stock);

        stock.unregister(investorB);

        stock.setPrice(120.0);
    }
}
