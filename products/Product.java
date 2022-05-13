package solid.products;

import solid.interfaces.Printer;

public abstract class Product implements Printer {
    private String name;
    private double price;
    private double rate;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRate() {
        return rate;
    }
}
