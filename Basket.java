package solid;

import solid.interfaces.Printer;
import solid.products.Product;
import java.util.ArrayList;
import java.util.List;

//SRP - Просто коризина.
public class Basket implements Printer, Cloneable {

    protected List<Product> productList;

    public Basket() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void print() {
        if (productList.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            for (Product product : productList) {
                System.out.println(product.getName());
            }
        }
    }
}
