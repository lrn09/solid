package solid;

import solid.interfaces.Printer;
import solid.products.Product;
import java.util.List;

public class Shop implements Printer {

    private List<Product> availableProducts;
    protected List<Product> previousOrder;
    CashRegister cashRegister;
    Basket basket;

    public Shop(List availableProducts, CashRegister cashRegister) {
        this.availableProducts = availableProducts;
        this.cashRegister = cashRegister;
        basket = new Basket();

    }

    @Override
    public void print() {
        for (Product product : availableProducts) {
            product.print();
        }
    }

    public void addToBasket(String name) {
        for (Product product : availableProducts) {
            if (product.getName().equals(name)) {
                basket.productList.add(product);
                break;
            }
        }
    }

    public void removeFromBasket(String name) {
        for (Product product : basket.productList) {
            if (product.getName().equals(name)) {
                basket.productList.remove(product);
                break;
            }
        }
    }

    public void buy() {
        previousOrder = List.copyOf(basket.productList);
        basket.productList.clear();
    }

    public void repeatPreviousPurchase() {
        basket.setProductList(previousOrder);
    }


}
