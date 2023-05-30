package src;

import java.util.ArrayList;

public class Stock implements StockInterface{
    private double price;
    String name;
    private ArrayList<Investor> observers;
    public Stock(String name , double price)
    {
        this.setName(name);
        this.setPrice(price);
        observers=new ArrayList<Investor>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public void register(Investor investor){
        if(!observers.contains(investor))
        {
            observers.add(investor);
        }
        else {
            System.out.println("Investor already registered");
        }
    }
    @Override
    public  void unregister(Investor investor){
        if(observers.contains(investor))
        {
            observers.remove(investor);
        }
        else {
            System.out.println("Investor not registered");
        }
    }
    @Override
    public void notifyChange(){
        for (Investor investor : observers) {
            investor.update(this);
        }
    }
}
