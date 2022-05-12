package solid;

//SRP
public class Product {
    private String name;
    private double price;
    private double rate;

    public Product(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
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

    //DRY
    @Override
    public String toString() {
        return "Название - " + name + " Цена - " + price + " Рейтинг - " + rate;
    }
}
