package solid;

import solid.interfaces.Printer;
import solid.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Printer {

    protected final List<Product> productList;

    public Basket() {
        productList = new ArrayList<>();
    }

    @Override
    public void print() {
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }
}
