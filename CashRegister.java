package solid;

//LSP - мог бы наследоваться от класса Product, но не является товаром
public class CashRegister {
    private String name;
    private int price;
    private double rate;

    public CashRegister(String name, int price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }
}
