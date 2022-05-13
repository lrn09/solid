package solid.products;

public class Apple extends Product {
    private String name;
    private double price;
    private double rate;

    public Apple(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    @Override
    public void print() {
        System.out.println("Название: " + name
                + ", цена: " + price
                + ", рейтинг: " + rate);
    }

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
