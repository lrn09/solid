package solid;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Printer {

    private final List<Product> productList;

    public Basket() {
        productList = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        productList.add(product);
    }

    public boolean removeFromBasket(Product product) {
        if (!productList.contains(product)) {
            System.out.println("No such product in the basket!");
            return false;
        } else {
            return productList.remove(product);
        }

    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void print() {
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }
}
